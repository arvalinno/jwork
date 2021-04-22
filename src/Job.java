
/**
 * class buat Job
 *
 * @author Arvalinno
 * @version 18.03.2021
 */
public class Job
{
    private int id;
    private String name;
    private int fee;
    private JobCategory category;
    private Recruiter recruiter;
    
    /**
    * Constructor dari Class Job
    * @param id id dari Job
    * @param name nama dari Job
    * @param recruiter untuk objek recruiter
    * @param fee untuk biaya
    * @param category untuk kategori pekerjaan
    */
    public Job(int id, String name, Recruiter recruiter, int fee, JobCategory category)
    {
        this.id = id;
        this.recruiter = recruiter;
        this.name = name;
        this.fee = fee;
        this.category = category;
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
    * method mengembalikan fee
    * @return int
    */
    public int getFee()
    {
        return fee;
    }
    /**
    * method mengembalikan nilai kategori
    * @return String
    */
    public JobCategory getCategory()
    {
        return category;
    }
    /**
    * method mengembalikan nilai kategori
    * @return String
    */
    public Recruiter getRecruiter()
    {
        return recruiter;
    }
    /**
    * method mengganti id
    * @param id
    * @return void
    */
    public void setId(int id)
    {
       this.id = id;
    }
    /**
    * method mengganti name
    * @param name
    * @return void
    */
    public void setName(String name)
    {
       this.name = name;
    }
    /**
    * method mengganti recruiter
    * @param recruiter
    * @return void
    */
    public void setRecruiter(Recruiter recruiter)
    {
       this.recruiter = recruiter;
    }
    /**
    * method mengganti fee
    * @param fee
    * @return void
    */
    public void setFee(int fee)
    {
        this.fee = fee;
    }
    /**
    * method mengganti kategori job
    * @param kategori
    * @return void
    */
    public void setCategory(JobCategory category)
    {
        this.category = category;
    }
    /**
    * method mencetak data
    * @return void
    */
    @Override
    public String toString() {
        return "Id = " + getId() + "\nName = " + getName() + "\nRecruiter = "
                + getRecruiter() + "\nCity= " + getRecruiter().getLocation().getCity()
                + "\nFee = " + getFee() + "\nCategory = " + getCategory();
    }
}
