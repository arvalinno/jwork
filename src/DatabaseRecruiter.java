
/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author Arvalinno
 * @version 23.03.2021
 */
import java.util.ArrayList;

public class DatabaseRecruiter
{
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    /**
     * method mendapatkan listrecuiter
     * @return String[]
     */
    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    /**
     * method mendapatkan recuiter
     * @return null
     */
    public static Recruiter getRecruiterById(int id){
        Recruiter RecruiterA = null;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                RecruiterA = recruiter;
            }
            else{
                RecruiterA =  null;
            }
        }
        return RecruiterA;
    }

    /**
     * method menambahkan recruiter
     * @param recruiter
     * @return boolean
     */
    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }
    
    /**
     * method menghapus recruiter
     * @param id
     * @return boolean
     */
    public static boolean removeRecruiter(int id){
        boolean booleanA = true;
        for (Recruiter recruiter: RECRUITER_DATABASE) {
            if (id == recruiter.getId()){
                RECRUITER_DATABASE.remove(id);
                booleanA = true;
            }
            else{
                booleanA = false;
            }
        }
        return booleanA;
    }
}
