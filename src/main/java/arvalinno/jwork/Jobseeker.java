package arvalinno.jwork;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 * Write a description of class Jobseeker here.
 *
 * @author Arvalinno
 * @version 23.03.2021
 */
public class Jobseeker {
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private String email;
    private String password;
    public Calendar joinDate;

    /**
     * Constructor dari Class Jobseeker
     *
     * @param id       id dari Jobseeker
     * @param name     nama dari Jobseeker
     * @param email    email dari Jobseeker
     * @param password dari Jobseeker
     * @param joinDate tanggal masuk Jobseeker
     */
    public Jobseeker(int id, String name, String email, String password, Calendar joinDate) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = joinDate;
    }

    public Jobseeker(int id, String name, String email, String password, int year, int month, int dayOfMonth) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    public Jobseeker(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        setEmail(email);
        setPassword(password);
    }


    /**
     * method mengembalikan id
     *
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * method mengembalikan nama
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * method mengembalikan email
     *
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * method mengembalikan password
     *
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * method mengembalikan joinDate
     *
     * @return String
     */
    public Calendar getJoinDate() {
        return joinDate;
    }

    /**
     * method mengganti id
     *
     * @return void
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * method mengganti nama
     *
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method mengganti nama
     *
     * @return void
     */

    public void setEmail(String email) {
        String regex = "^[a-zA-Z0-9&*_~]+([\\.{1}]?[a-z]+)+@[a-z0-9]+([\\.]{1}[a-z]+)\\S+(?!.*?\\.\\.)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            this.email = email;
        } else {
            this.email = "";
        }
    }

    public void setPassword(String password)
    {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            this.password = password;
        }
        else{
            this.password = "";
        }
    }

    public void setJoinDate(Calendar joinDate) {
        this.joinDate = joinDate;
    }

    public void setJoinDate(int year, int month, int dayOfMonth) {
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }

    @Override
    public String toString() {
        if (this.joinDate == null) {
            return "Id = " + getId() + "\nNama = " + getName() + "\nEmail = " + getEmail() + "\nPassword = " + getPassword() + "\n";
        } else {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
            String strDate = formatter.format(date);
            return "Id = " + id + "\nNama = " + name + "\nEmail = " + email + "\nPassword = " + password + "\nJoin Date = " + strDate + "\n";
        }
    }
}
