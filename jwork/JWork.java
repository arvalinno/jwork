
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
        
        job1.printData();
    }
}
