package airportapp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
@Component
public class User implements Comparable<User> {

    private String fname;
    private String lname;
    private Date birthDate;

    @Override
    public int compareTo(User user) {
        if(this.fname == user.fname && this.lname == user.lname && this.birthDate.equals( user.birthDate )){
            return 0;}
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals( fname, user.fname ) &&
                Objects.equals( lname, user.lname ) &&
                Objects.equals( birthDate, user.birthDate );
    }

    @Override
    public int hashCode() {
        return Objects.hash( fname, lname, birthDate );
    }

    @Override
    public String toString() {
        return "User{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }


    public String getFName() {
        return fname;
    }

    public void setFName(String fname) {
        this.fname = fname;
    }

    public String getLName() {
        return lname;
    }

    public void setLName(String lname) {
        this.lname = lname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        SimpleDateFormat birthDateFormat = new SimpleDateFormat( "dd.MM.yyyy" );
        try {
            this.birthDate = birthDateFormat.parse( birthDate );
        }
        catch (ParseException e) {
            System.out.println("Date type not valid. Please insert in format: dd.MM.yyyy");
        }

    }




}
