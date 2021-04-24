import java.util.GregorianCalendar;

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
     *
     * @return void
     */
    public static void main(String args[]){  
        Location Medan = new Location("Sumatera Utara", "Medan", "tempat lahir");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Arvalinno", "arvalinno@gmail.com", "082288885625", Medan));

     /*   DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Arva", "arvalinno@ui.ac.id", "pAssword123", 2021, 03, 6));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Arva", "arvalinno@ui.ac.id", "pAssword123", 2021, 04 ,6));
        DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ilham", "ilham@ui.ac.id", "m1cheaL23J"));

        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());

        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Data Analyst Jaya Sentosa", DatabaseRecruiter.getRecruiterById(1), 5000000, JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Web Developer Jaya Sentosa", DatabaseRecruiter.getRecruiterById(1), 6000000, JobCategory.WebDeveloper));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Web Developer Sinar Abadi", DatabaseRecruiter.getRecruiterById(1), 7000000, JobCategory.WebDeveloper));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.WebDeveloper)); */

        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "OKEOC45", 50000, 10000, false));
        DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "OKEOC45", 40000, 10000, true));
        System.out.println(DatabaseBonus.getBonusDatabase());

      /*  Recruiter recruiter1 = new Recruiter(1, "Arvalinno", "arvalinno@gmail.com", "082288885625", Medan);
        Job job1 = new Job(1, "Junior Data Analyst", recruiter1, 5000000, JobCategory.DataAnalyst);
        Jobseeker jobseeker1 = new Jobseeker(1, "Tony", ".tony@gmail.com", "password", new GregorianCalendar(2021, 04, 10));
        Jobseeker jobseeker2 = new Jobseeker(2, "William", "william12.wijaya@gmail.com", "pAssword123", 2021, 04, 11);
        Jobseeker jobseeker3 = new Jobseeker(3, "Micheal", "micheal2hartono@gmail.com", "m1cheaL23J"); */

     //   System.out.println(jobseeker1.toString());
      //  System.out.println(jobseeker2.toString());
       // System.out.println(jobseeker3.toString());

        //Jobseeker jobseeker4 = new Jobseeker(1, "Tony", "tony2.nathaniel@gmail.com", "Passw0rd654", new GregorianCalendar(2021, 04, 10));

        //System.out.println(jobseeker4.toString());

   /*     Bonus bonusA = new Bonus(7, "OOPASIK", 5000000, 4500000, true);
        Bonus bonusB = new Bonus(8, "ASIKNIH", 7000000, 6500000, true);

        EwalletPayment payment1 = new EwalletPayment(1, job1,  jobseeker1, InvoiceStatus.OnGoing);
        EwalletPayment payment2 = new EwalletPayment(2, job1, jobseeker1, bonusA, InvoiceStatus.Finished);
        EwalletPayment payment3 = new EwalletPayment(3, job1, jobseeker1, bonusB, InvoiceStatus.OnGoing);

        BankPayment bpayment1 = new BankPayment(5, job1,  jobseeker1, InvoiceStatus.Finished);
        BankPayment bpayment2 = new BankPayment(6, job1, jobseeker1, InvoiceStatus.Finished, 30000);

        payment1.setTotalFee();
        payment2.setTotalFee();
        payment3.setTotalFee();
        bpayment1.setTotalFee();
        bpayment2.setTotalFee();

        System.out.println(payment1.toString());
        System.out.println(payment2.toString());
        System.out.println(payment3.toString());
        System.out.println(bpayment1.toString());
        System.out.println(bpayment2.toString()); */
    }
}
