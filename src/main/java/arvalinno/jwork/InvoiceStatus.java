package arvalinno.jwork;

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

}
