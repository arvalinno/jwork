import java.util.ArrayList;

/**
 * Kelas DatabaseJob
 *
 * @author Arvalinno
 * @version 18.03.2021
 */
public class DatabaseJob {

    private static ArrayList<Job> JOB_DATABASE = new ArrayList<Job>();
    private static int lastId;

    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    /**
     * method mendapatkan job
     * @return Job
     */
    public static Job getJobById(int id){
        Job y = null;
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (id == JOB_DATABASE.get(i).getId()) {
                y = JOB_DATABASE.get(i);
            }
        }
        return y;
    }

    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> jobA = new ArrayList<Job>();
        for (Job job : JOB_DATABASE) {
            if (recruiterId == job.getRecruiter().getId()) {
                jobA.add(job);
            } else {
                return null;
            }
        }
        return jobA;
    }

    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> jobA = new ArrayList<Job>();
        for (int i = 0; i < JOB_DATABASE.size(); i++) {
            if (category == JOB_DATABASE.get(i).getCategory()) {
                jobA.add(JOB_DATABASE.get(i));
            }
        }
        return jobA;
    }

    /**
     * method menambahkan job
     * @param job
     * @return boolean
     */
    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }
    
    /**
     * method menghapus job
     * @param job
     * @return boolean
     */
    public static boolean removeJob(Job job){
        for (Job jobA : JOB_DATABASE) {
            if (job.getId() == jobA.getId()) {
                JOB_DATABASE.remove(job);
                return true;
            }
        }
        return false;
    }
}

