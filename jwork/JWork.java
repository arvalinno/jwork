
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
        
        /* Bonus bonusA = new Bonus(7, "OOPASIK", 5000000, 4500000, true);
        Bonus bonusB = new Bonus(8, "ASIKNIH", 7000000, 6500000, true);
        
        EwalletPayment payment1 = new EwalletPayment(1, job1, "28 Maret 2021", jobseeker1, InvoiceStatus.OnGoing);
        EwalletPayment payment2 = new EwalletPayment(2, job1, "31 Maret 2021", jobseeker1, bonusA, InvoiceStatus.Finished);
        EwalletPayment payment3 = new EwalletPayment(3, job1, "01 April 2021", jobseeker1, bonusB, InvoiceStatus.OnGoing);
           
        payment1.printData();
        payment2.printData();
        payment3.printData(); */
        
        BankPayment payment1 = new BankPayment(5, job1, "02/4/2020", jobseeker1, InvoiceStatus.Finished);

        BankPayment payment2 = new BankPayment(6, job1, "03/4/2020", jobseeker1, InvoiceStatus.Finished, 30000);

        payment1.printData();
        payment2.printData();
    }
}
