
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceStatus
{
    OnGoing("On Going"), Finished("Finished"), Cancelled("Cancelled");
    
    private String invoicestatus;

    private InvoiceStatus(String invoicestatus) {
        this.invoicestatus = invoicestatus;
    }

    @Override
    public String toString() {
        return invoicestatus;
    }

    public static void main(String[] args) {
        InvoiceStatus invoicestatus1 = InvoiceStatus.OnGoing;
        InvoiceStatus invoicestatus2 = InvoiceStatus.Finished;
        InvoiceStatus invoicestatus3 = InvoiceStatus.Cancelled;
        
        System.out.println(invoicestatus1);
        System.out.println(invoicestatus2);
        System.out.println(invoicestatus3);
    }
}
