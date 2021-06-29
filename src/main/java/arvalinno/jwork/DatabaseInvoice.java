package arvalinno.jwork;

import java.util.ArrayList;

public class DatabaseInvoice {
    private static final ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId;

    public static ArrayList<Invoice> getInvoiceDatabase() {
        return INVOICE_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException {
        Invoice result = null;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                result = invoice;
            } else {
                result = null;
            }
        }
        if (result == null) {
            throw new InvoiceNotFoundException(id);
        }

        return result;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int customerId) {
        ArrayList<Invoice> invoiceJobseeker = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if (customerId == invoice.getJobseeker().getId()) {
                invoiceJobseeker.add(invoice);
            }
        }
        return invoiceJobseeker;
    }

    public static boolean addInvoice(Invoice invoice) throws OnGoingInvoiceAlreadyExistsException {
        for (Invoice invoicee : INVOICE_DATABASE) {
            if (invoicee.getInvoiceStatus() == InvoiceStatus.OnGoing) {
                throw new OnGoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus) {
        boolean temp = true;
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                invoice.setInvoiceStatus(InvoiceStatus.OnGoing);
                temp = true;
            } else {
                temp = false;
            }
        }
        return temp;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
