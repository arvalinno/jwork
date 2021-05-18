package arvalinno.jwork;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Class Invoice
 *
 * @author Arvalinno
 * @version 18.03.2021
 */

public abstract class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private ArrayList<Job> jobs = new ArrayList<Job>();
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobseeker;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor untuk objek dari class Invoice
     * @param id id invoice
     * @param idJob id dari perkerjaan
     * @param date tanggal invoice
     * @param totalFee total biaya
     * @param jobseeker objek jobseeker yang ada
     */
    public Invoice(int id, ArrayList<Job> jobs, Jobseeker jobseeker){
        this.id = id;
        this.jobs = jobs;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
        this.invoiceStatus = invoiceStatus.OnGoing;
        this.date = Calendar.getInstance();
    }

    /**
     * method mendapatkan id
     *
     * @return int mengembalikan id
     */
    public int getId(){
        return id;
    }
    
    /**
     * method mendapatkan idJob
     *
     * @return int mengembalikan idJob
     */
    public ArrayList<Job> getJobs(){
        return jobs;
    }
    
    /**
     * method mendapatkan tanggal
     *
     * @return String mengembalikan tanggal
     */
    public Calendar getDate(){
        return date;
    }
    
    /**
     * method mendapatkan total biaya
     *
     * @return int mengembalikan total biaya
     */
    public int getTotalFee(){
        return totalFee;
    }
    
    /**
     * method mendapatkan objek jobseeker
     *
     * @return Jobseeker mengembalikan jobseeker
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    
    
    /**
     * method mengganti id
     * @param id id invoice
     * @return void
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * method mengganti idJob
     * @param idJobs id dari job
     * @return void
     */
    public void setJobs(ArrayList<Job> jobs){
        this.jobs = jobs;
    }
    
    /**
     * method mengganti idJob
     * @param idJobs id dari job
     * @return void
     */
    public void setDate(Calendar date){
        this.date = date;
    }

    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    /**
     * method mengganti TotalFee
     * @param totalFee
     * @return void
     */
    public abstract void setTotalFee();
    
    /**
     * method mengganti jobseeker
     * @param jobseeker object jobseeker
     * @return void
     */
    public void setJobseeker(Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
    
    public void setInvoiceStatus (InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }
    
    /**
     * method mencetak data
     * @return void
     */

    public abstract String toString();
}

