
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{    
    public JWork(){
    }
    
    public static void main(String args[]){  
        Location Medan = new Location("Sumatera Utara", "Medan", "tempat lahir");
        Recruiter recruiter1 = new Recruiter(1, "Arvalinno", "arvalinno@gmail.com", "082288885625", Medan);
        Job job1 = new Job(1, "Sales", recruiter1, 5000000, "Marketing");
        Jobseeker jobseeker1 = new Jobseeker(1, "Dony", "dony11@gmail.com", "sayahebat12", "12-02-2020");
        Invoice invoice1 = new Invoice(1, 1, "23-02-2020", 6000000, jobseeker1);
        System.out.println(recruiter1.getName());
        recruiter1.setName("IM");
        System.out.println(recruiter1.getName());
        job1.printData();
    }
}
