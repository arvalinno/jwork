public class OnGoingInvoiceAlreadyExistsException extends Exception{
    private Invoice invoice_error;

    public OnGoingInvoiceAlreadyExistsException(Invoice invoice_input){
        super("OnGoing Invoice : ");
        this.invoice_error = invoice_input;
    }

    public String getMessage() {
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exists.";
    }
}
