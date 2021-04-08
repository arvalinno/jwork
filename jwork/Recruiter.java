
/**
 * Kelas Recruiter
 *
 * @author Arvalinno
 * @version 18.03.2021
 */
public class Recruiter
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;
    /**
    * Constructor dari Class Recruiter
    * @param id id dari Recruiter
    * @param name nama dari Recruiter
    * @param email email dari Recruiter
    * @param phoneNumber nomor telepon Recruiter
    * @param location untuk objek Location
    */
    public Recruiter(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    /**
    * method mengembalikan id
    * @return int
    */
    public int getId()
    {
        return id;
    }
    /**
    * method mengembalikan nama
    * @return String
    */
        public String getName()
    {
        return name;
    }
    /**
    * method mengembalikan email
    * @return String
    */
    public String getEmail()
    {
        return email;
    }
    /**
    * method mengembalikan nomor telepon
    * @return String
    */
     public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
    * method mengembalikan objek location
    * @return Location
    */
    public Location getLocation(){
        return location;
    }
    /**
    * method mengubah id
    * @return void
    */
    public void setId(int id){
        this.id = id;
    }
    /**
    * method mengubah email
    * @return void
    */
    public void setEmail(String Email)
    {
        this.email = email;
    }
    /**
    * method mengubah nama
    * @return void
    */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
    * method mengubah nomor telepon
    * @return void
    */
    public void setPhoneNumber(String phoneNumber){
        this.location = location;
    }
    /**
    * method mengubah objek location
    * @return void
    */
    public void setLocation(Location location)
    {
        this.location = location;
    }
    /**
    * method mencetak data yaitu nama
    * @return void
    */
    @Override
    public String toString() {
        return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = "
                + getEmail() + "\nPhone Number = "
                + getPhoneNumber() + "\nLocation = "
                + getLocation();
    }
}

