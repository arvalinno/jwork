package arvalinno.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location Medan = new Location("Sumatera Utara", "Medan", "tempat lahir");
        Location Bandung = new Location("Jawa Barat", "Bandung", "lautan api");
        Location Tangerang = new Location("Banten", "Tangerang", "kota metropolitan");

        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Arvalinno", "arvalinno@gmail.com", "082288885625", Medan));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "John Paul", "johnpaul@gmail.com", "082288885626", Bandung));
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Mikey Hill", "mikeyhill@gmail.com", "082288885627", Tangerang));

        try {
            DatabaseJob.addJob(new Job(1, "Web Developer Sinar Abadi", DatabaseRecruiter.getRecruiterById(1), 15000, JobCategory.WebDeveloper));
            DatabaseJob.addJob(new Job(2, "Data Scientist  Jaya Sentosa",  DatabaseRecruiter.getRecruiterById(1), 9000, JobCategory.DataScientist));
            DatabaseJob.addJob(new Job(3, "Data Analyst Jaya Sentosa",  DatabaseRecruiter.getRecruiterById(2), 12000, JobCategory.DataAnalyst));
            DatabaseJob.addJob(new Job(4, "Front End Jaya Sentosa",  DatabaseRecruiter.getRecruiterById(3), 11000, JobCategory.FrontEnd));
        }
        catch(RecruiterNotFoundException e){
            e.printStackTrace();
        }

        try {
            DatabaseBonus.addBonus(new Bonus(1, "PASTI123", 300, 1000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            e.printStackTrace();
        }

        SpringApplication.run(JWork.class, args);
    }
}
