import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id){
        Invoice invoiceA = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                invoiceA = invoice;
            }
        }
        return invoiceA;
    }

    public static ArrayList<Invoice> getJobByJobseeker(int jobseekerId) {
        ArrayList<Invoice> invoiceA = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobseekerId == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                invoiceA.add(INVOICE_DATABASE.get(i));
            }
        }
        return invoiceA;
    }

    public static boolean addInvoice(Invoice invoice) {
        {
            for (Invoice invoiceA : INVOICE_DATABASE) {
                if (invoiceA.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                    return false;
                }
            }
            INVOICE_DATABASE.add(invoice);
            lastId = invoice.getId();
            return true;
        }
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus)
    {
        boolean booleanA = true;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                invoice.setInvoiceStatus(InvoiceStatus.OnGoing);
                booleanA = true;
            }
            else{
                booleanA = false;
            }
        }
        return booleanA;
    }

    public static boolean removeInvoice(int id)
    {
        boolean booleanA = true;
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                INVOICE_DATABASE.remove(id);
                booleanA = true;
            }
            else{
                booleanA = false;
            }
        }
        return booleanA;
    }
}
