
/**
 * Kelas DatabaseJob
 *
 * @author Arvalinno
 * @version 18.03.2021
 */
public class DatabaseJob {
    private String[] listJob;
    
    /**
    * constructor kelas DatabaseJob
    * 
    */
    public DatabaseJob(){
       listJob = new String[100];
    }
    /**
    * constructor kelas DatabaseJob
    * @param listJob sebagai string
    */
    public DatabaseJob(String[] listJob){
        this.listJob = listJob;
    }
    /**
     * method menambahkan job
     * @param job
     * @return boolean
     */
    public boolean addJob(Job job){
        return false;
    }
    
    /**
     * method menghapus job
     * @param job
     * @return boolean
     */
    public boolean removeJob(Job job){
        return false;
    }
    
    /**
     * method mendapatkan job
     * @return Job
     */
    public Job getJob(){
        return null;
    }
    /**
     * method mendapatkan listjob
     * @return String[]
     */
    public String[] getListJob(){
        return listJob;
    }
}

