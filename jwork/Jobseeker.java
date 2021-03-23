
/**
 * Write a description of class Jobseeker here.
 *
 * @author Arvalinno
 * @version 23.03.2021
 */
public class Jobseeker
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;
    private Jobseeker jobseeker;
    
/**
 * Constructor dari Class Jobseeker
 * @param id id dari Jobseeker
 * @param name nama dari Jobseeker
 * @param email email dari Jobseeker
 * @param password dari Jobseeker
 * @param joinDate tanggal masuk Jobseeker
 */
    public Jobseeker(int id, String name, String email, String password, String joinDate)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
    }

/**
 * method mengembalikan id
 * @return int
 */
    public int getId(){
        return id;
    }
/**
 * method mengembalikan nama
 * @return String
 */
    public String getName(){
        return name;
    }
/**
 * method mengembalikan email
 * @return String
 */
    public String getEmail(){
        return email;
    }
/**
 * method mengembalikan password
 * @return String
 */
    public String getPassword(){
        return password;
    }
/**
 * method mengembalikan joinDate
 * @return String
 */
     public String joinDate(){
        return joinDate;
    }
/**
 * method mengganti id
 * @return void
 */
    public void setId(int id){
        this.id = id;
    }
/**
 * method mengganti nama
 * @return void
 */
    public void setName(String name){
        this.name = name;
    }
/**
 * method mengganti nama
 * @return void
 */
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }
    public void printData(){
        System.out.println(this.name);
    }
}
