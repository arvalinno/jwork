
/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author Arvalinno
 * @version 23.03.2021
 */
public class DatabaseRecruiter
{
    private String[] listRecruiter;

    /**
     * Constructor untuk objek pada kelas DatabaseRecruiter
     */
    
    public DatabaseRecruiter(String[] listRecruiter){
        this.listRecruiter = listRecruiter;
    }
    /**
     * method menambahkan recruiter
     * @param recruiter
     * @return boolean
     */
    public boolean addRecuiter(Recruiter recruiter){
        return false;
    }
    
    /**
     * method menghapus recruiter
     * @param recruiter
     * @return boolean
     */
    public boolean removeRecruiter(Recruiter recruiter){
        return false;
    }
    
    /**
     * method mendapatkan recuiter
     * @return null
     */
    public Job getRecruiter(){
        return null;
    }
    /**
     * method mendapatkan listrecuiter
     * @return String[]
     */
    public String[] getListRecruiter(){
        return listRecruiter;
    }
    
}
