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
    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker element : JOBSEEKER_DATABASE) {
            if (element.getEmail() == jobseeker.getEmail()) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }
    
    /**
     * method menghapus Jobseeker
     * @param id
     * @return boolean
     */
    public static boolean removeJobseeker(int id) throws JobseekerNotFoundException {

            for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
                if (jobseeker.getId() == id) {
                    JOBSEEKER_DATABASE.remove(jobseeker);
                    return true;
                }
            }
            throw new JobseekerNotFoundException(id);
    }
    
    /**
     * method mendapatkan Jobseeker
     * @return null
     */
    public static Jobseeker getJobseekerById(int id) throws JobseekerNotFoundException {
        Jobseeker JobseekerA = null;

        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++) {
            if (id == JOBSEEKER_DATABASE.get(i).getId()) {
                JobseekerA = JOBSEEKER_DATABASE.get(i);
                return JobseekerA;
            }
        }
        throw new JobseekerNotFoundException(id);

    }
}