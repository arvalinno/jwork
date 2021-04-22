import java.util.ArrayList;

/** Write a description of class DatabaseRecruiter here.
 *
 * @author Arvalinno
 * @version 25.03.2021
 */
public class DatabaseJobseeker
{
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE = new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getDatabaseJobseeker() {
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    /**
     * method menambahkan Jobseeker
     * @param jobseeker
     * @return boolean
     */
    public static boolean addJobseeker(Jobseeker jobseeker) {
        boolean booleanA = false;
        if (JOBSEEKER_DATABASE.size() == 0){
            JOBSEEKER_DATABASE.add(jobseeker);
            lastId = jobseeker.getId();
            booleanA = true;
            return booleanA;
        }
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (jobseeker.getEmail() == JOBSEEKER_DATABASE.get(i).getEmail()) {
                System.out.println("Email has been used");
                booleanA = false;
                return booleanA;
            } else {
                JOBSEEKER_DATABASE.add(jobseeker);
                lastId = jobseeker.getId();
                booleanA = true;
                return booleanA;
            }
        }
        return booleanA;
    }
    
    /**
     * method menghapus Jobseeker
     * @param id
     * @return boolean
     */
    public static boolean removeJobseeker(int id){
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getId() == jobseeker.getId()) {
                JOBSEEKER_DATABASE.remove(jobseeker);
                return true;
            }
        }
        return false;
    }
    
    /**
     * method mendapatkan Jobseeker
     * @return null
     */
    public static Jobseeker getJobseekerById(int id) {
        Jobseeker JobseekerA = null;
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (id == JOBSEEKER_DATABASE.get(i).getId()) {
                JobseekerA = JOBSEEKER_DATABASE.get(i);
            }
        }
        return JobseekerA;
    }
}