import java.text.SimpleDateFormat;



/**
 * Write a description of class BankPayment here.
 *
 * @author Arvalinno
 * @version 03.04.2021
 */
public class BankPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee;
    
        /**
     * Constructor for objects of class BankPayment
     */
    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id, job, jobseeker, invoiceStatus);
    }

    public BankPayment(int id, Job job, Jobseeker jobseeker, InvoiceStatus invoiceStatus, int adminFee){
        super(id, job, jobseeker, invoiceStatus);
        this.setAdminFee(adminFee);
    }
    
    @Override
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public int getAdminFee() {
        return adminFee;
    }
    
    public void setAdminFee(int adminFee) {
        this.adminFee = adminFee;
    }
    
    @Override
    public void setTotalFee() {
         if (adminFee > 0) {
            super.totalFee = getJob().getFee() - adminFee;
        } else {
            super.totalFee = getJob().getFee();
        }    
    }
    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        String date = dateFormat.format(getDate().getTime());

        if (adminFee != 0){
            return ("===================== INVOICE =====================\n" + "Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                    + getJobseeker().getName() + "\nAdmin Fee = " + adminFee + "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }else{
            return ("===================== INVOICE =====================\n" + "Id = " + getId() + "\nJob = " + getJob().getName() + "\nDate = " + date + "\nJob Seeker = "
                    + getJobseeker().getName()+ "\nTotal Fee = " + getTotalFee() + "\nStatus = " + getInvoiceStatus() + "\nPayment = " + PAYMENT_TYPE);
        }

        /*System.out.println("===================== INVOICE =====================");
        System.out.println("ID: " + getId());
        System.out.println("Job: " + getJob().getName());
        System.out.println("Date: " + getDate());
        System.out.println("Job Seeker: " + getJobseeker().getName());
        System.out.println("Admin Fee: " + adminFee);
        setTotalFee();
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Status: " + getInvoiceStatus());
        System.out.println("Payment Type: " + PAYMENT_TYPE); */
    }
}
