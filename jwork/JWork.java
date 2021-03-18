
/**
 * Write a description of class JWork here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JWork
{    
    
    
    public void main(String args[]){  
        Location Medan = new Location("Sumatera Utara", "Medan", "rumah saya");
        Recruiter recruiter1 = new Recruiter(1, "Mike", "mike333@gmail.com", "082288888888", Medan);
        Job job1 = new Job(1, "Sales", recruiter1, 5000000, "Marketing");
        Jobseeker jobseeker1 = new Jobseeker(1, "Dony", "dony11@gmail.com", "sayahebat12", "12-02-2020");
        Invoice invoice1 = new Invoice(1, 1, "23-02-2020", 6000000, jobseeker1);

    }
}
