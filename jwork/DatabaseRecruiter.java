
/**
 * Write a description of class DatabaseRecruiter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseRecruiter
{
    // instance variables - replace the example below with your own
    private String[] listRecruiter;

    /**
     * Constructor for objects of class DatabaseRecruiter
     */
    public DatabaseRecruiter()
    {
        listRecruiter = new String[100];
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
