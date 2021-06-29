package arvalinno.jwork;

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
        for (Jobseeker jobseeker1 : JOBSEEKER_DATABASE) {
            if (jobseeker1.getEmail().equals(jobseeker.getEmail())) {
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
                JOBSEEKER_DATABASE.remove(jobseeker.getId());
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
        Jobseeker temp = null;
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (id == jobseeker.getId()) {
                temp = jobseeker;
                return temp;
            }
        }
        throw new JobseekerNotFoundException(id);
    }

    public static Jobseeker getJobseekerLogin(String email, String password){
        for (Jobseeker jobseeker : JOBSEEKER_DATABASE) {
            if (jobseeker.getEmail().equals(email) && jobseeker.getPassword().equals(password)) {
                return jobseeker;
            }
        }
        return null;
    }
}