
/**
 * Kelas Location
 *
 * @author Arvalinno
 * @version 18.03.2021
 */
public class Location
{
    private String province;
    private String city;
    private String description;
    
    /**
    * Constructor dari Class Location
    * @param province nama provinsi dari Location
    * @param city nama kota dari Location
    * @param description sebuah deskripsi untuk objek Location
    */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
    }
    /**
    * method mengembalikan nama provinsi
    * @return String
    */
    public String getProvince()
    {
        return province;
    }
    /**
    * method mengembalikan nama kota atau City
    * @return String
    */
    public String getCity()
    {
        return city;
    }
    /**
    * method mengembalikan id
    * @return int
    */
    public String getDescription()
    {
        return description;
    }
    /**
    * method mengganti nama provinsi
    * @return void
    */
    public void setProvince(String province)
    {
        this.province = province;
    }
    /**
    * method mengganti nama kota atau city
    * @return void
    */
    public void setCity(String city)
    {
        this.city = city;
    }
    /**
    * method mengganti deskripsi
    * @return void
    */
    public void setDescription(String description)
    {
        this.description = description;
    }
    /**
    * method mencetak data yaitu nama provinsi
    * @return void
    */
    public void printData(){
        System.out.println(this.province);
    }
}
