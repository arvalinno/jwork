import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Write a description of class JWork here.
 *
 * @author Arvalinno
 * @version 23.03.2021
 */
public class JWork extends Thread
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
    public static void main(String args[]) {
        Location Medan = new Location("Sumatera Utara", "Medan", "tempat lahir");
        DatabaseRecruiter.addRecruiter(new Recruiter(DatabaseRecruiter.getLastId() + 1, "Arvalinno", "arvalinno@gmail.com", "082288885625", Medan));

    /*
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Arva", "arvalinno@ui.ac.id", "pAssword123", 2021, 03, 6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Arva11", "arvalinno@ui.ac.id", "pAssword123", 2021, 04 ,6));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Ilham", "ilham@ui.ac.id", "m1cheaL23J"));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(DatabaseJobseeker.getLastId() + 1, "Anton", "Anton@ui.ac.id", "m1cheaL23J111"));
        } catch (EmailAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }


        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "OKEOC45", 50000, 10000, false));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.addBonus(new Bonus(DatabaseBonus.getLastId()+1, "OKEOC45", 40000, 10000, true));
        } catch (ReferralCodeAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }



        ArrayList<Job> job1 = new ArrayList<Job>();
        try {
            job1.add(new Job(DatabaseJob.getLastId()+1, "Web Developer Sinar Abadi", DatabaseRecruiter.getRecruiterById(1), 15000, JobCategory.WebDeveloper));
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Job> job2 = new ArrayList<Job>();
        try {
            job2.add(new Job(DatabaseJob.getLastId()+1, "Data Analyst Jaya Sentosa",  DatabaseRecruiter.getRecruiterById(1), 9000, JobCategory.DataAnalyst));
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            DatabaseJobseeker.removeJobseeker(6);
        } catch (JobseekerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseRecruiter.removeRecruiter(2);
        } catch (RecruiterNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseJob.getJobById(2);
        } catch (JobNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            DatabaseBonus.getBonusById(4);
        } catch (BonusNotFoundException bonusNotFound) {
            System.out.println(bonusNotFound.getMessage());
        }

        System.out.println("\n=====================Jobseeker Database====================\n");
        System.out.println(DatabaseJobseeker.getDatabaseJobseeker());

        System.out.println("\n=====================Bonus Database====================\n");
        System.out.println(DatabaseBonus.getBonusDatabase());
        

     */
        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(1, job1, DatabaseJobseeker.getJobseekerById(1)));
        } catch (JobseekerNotFoundException | OnGoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(2, job2, DatabaseJobseeker.getJobseekerById(1)));
        } catch (JobseekerNotFoundException | OnGoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }

        try {
            DatabaseInvoice.addInvoice(new EwalletPayment(1, job1, DatabaseJobseeker.getJobseekerById(1)));
        } catch (JobseekerNotFoundException | OnGoingInvoiceAlreadyExistsException e) {
            e.printStackTrace();
        }

        try {
            DatabaseInvoice.getInvoiceById(4);
        } catch (InvoiceNotFoundException invoiceNotFound) {
            System.out.println(invoiceNotFound.getMessage());
        }

        System.out.println("\n=========================================\n");
        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            new Thread(new FeeCalculator(invoice)).start();
        }

        /*  DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Data Analyst Jaya Sentosa", DatabaseRecruiter.getRecruiterById(1), 5000000, JobCategory.BackEnd));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Web Developer Jaya Sentosa", DatabaseRecruiter.getRecruiterById(1), 6000000, JobCategory.WebDeveloper));
        DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Web Developer Sinar Abadi", DatabaseRecruiter.getRecruiterById(1), 7000000, JobCategory.WebDeveloper));

        System.out.println("\n=====================Job Database By Category====================\n");
        System.out.println(DatabaseJob.getJobByCategory(JobCategory.WebDeveloper));

        */

        //    BankPayment payment1 = new BankPayment(1, job1, DatabaseJobseeker.getJobseekerById(1), InvoiceStatus.Finished, 0);
    //    BankPayment payment2 = new BankPayment(2, job2, DatabaseJobseeker.getJobseekerById(1), InvoiceStatus.Finished, 12);

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
