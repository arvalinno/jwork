package arvalinno.jwork;

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

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice invoiceA = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                invoiceA = invoice;
            }
            else
                invoiceA = null;
        }
        if (invoiceA == null){
            throw new InvoiceNotFoundException(id);
        }
        return invoiceA;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId) {
        ArrayList<Invoice> invoiceA = new ArrayList<Invoice>();
        for (int i = 0; i < INVOICE_DATABASE.size(); i++) {
            if (jobseekerId == INVOICE_DATABASE.get(i).getJobseeker().getId()) {
                invoiceA.add(INVOICE_DATABASE.get(i));
            }
        }
        return invoiceA;
    }

    public static boolean addInvoice(Invoice invoice) throws OnGoingInvoiceAlreadyExistsException{
        for (Invoice element : INVOICE_DATABASE) {
            if (element.getInvoiceStatus() == InvoiceStatus.OnGoing && element.getId() == invoice.getId()) {
                throw new OnGoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
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

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for (Invoice invoice: INVOICE_DATABASE) {
            if (id == invoice.getId()){
                INVOICE_DATABASE.remove(id);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
