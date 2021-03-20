
/**
 * Class Invoice
 *
 * @author Arvalinno
 * @version 18.03.2021
 */

public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobseeker;

    /**
     * Constructor untuk objek dari class Invoice
     * @param id id invoice
     * @param idJob id dari perkerjaan
     * @param date tanggal invoice
     * @param totalFee total biaya
     * @param jobseeker objek jobseeker yang ada
     */
    public Invoice(int id, int idJob, String date, int totalFee, Jobseeker jobseeker ){
        this.id = id;
        this.idJob = idJob;
        this.date = date;
        this.totalFee = totalFee;
        this.jobseeker = jobseeker;
    }

    /**
     * method mendapatkan id
     *
     * @return int mengembalikan id
     */
    public int getId(){
        return id;
    }
    
    /**
     * method mendapatkan idJob
     *
     * @return int mengembalikan idJob
     */
    public int getIdJob(){
        return idJob;
    }
    
    /**
     * method mendapatkan tanggal
     *
     * @return String mengembalikan tanggal
     */
    public String getDate(){
        return date;
    }
    
    /**
     * method mendapatkan total biaya
     *
     * @return int mengembalikan total biaya
     */
    public int getTotalFee(){
        return totalFee;
    }
    
    /**
     * method mendapatkan objek jobseeker
     *
     * @return Jobseeker mengembalikan jobseeker
     */
    public Jobseeker getJobseeker(){
        return jobseeker;
    }
    
    /**
     * method mengganti id
     * @param id id invoice
     * @return void
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * method mengganti idJob
     * @param idJobs id dari job
     * @return void
     */
    public void setIdJobs(int idJobs){
        this.idJob = idJob;
    }
    
    /**
     * method mengganti idJob
     * @param idJobs id dari job
     * @return void
     */
    public void setDate(String date){
        this.date = date;
    }
    
    /**
     * method mengganti TotalFee
     * @param totalFee
     * @return void
     */
    public void setTotalFee(int totalFee){
        this.totalFee = totalFee;
    }
    
    /**
     * method mengganti jobseeker
     * @param jobseeker object jobseeker
     * @return void
     */
    public void setJobseeker(Jobseeker jobseeker) {
        this.jobseeker = jobseeker;
    }
    
    /**
     * method mencetak data
     * @return void
     */
    public void printData(){
        System.out.println(this.totalFee);
    }
}

