
/**
 * Write a description of class JWork here.
 *
 * @author Arvalinno
 * @version 23.03.2021
 */
public class JWork
{   
    /**
    * constructor kelas JWork
    * 
    */
    public JWork(){
    }
    /**
     * method main
     * @param args[]
     * @return void
     */
    public static void main(String args[]){  
        Location Medan = new Location("Sumatera Utara", "Medan", "tempat lahir");
        Recruiter recruiter1 = new Recruiter(1, "Arvalinno", "arvalinno@gmail.com", "082288885625", Medan);
        Job job1 = new Job(1, "Junior Data Analyst", recruiter1, 5000000, JobCategory.DataAnalyst);
        
        Jobseeker jobseeker1 = new Jobseeker(1, "Tony", "Tony@gmail.com", "password", "27/3/2021");

        Invoice invoice1 = new Invoice(1, job1.getId(), "27/3/2021", job1.getFee(), jobseeker1, PaymentType.EwalletPayment, InvoiceStatus.OnGoing);

        invoice1.printData();
        
        //job1.printData();
        
           
        //InvoiceStatus invoceStatus2 = InvoiceStatus.sembarang;
        
    }
}
