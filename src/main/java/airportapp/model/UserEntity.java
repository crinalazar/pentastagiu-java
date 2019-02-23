package airportapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "t_user")
public class UserEntity extends AbstractBaseEntity{

    @Column(name = "email")
  private String email;
    @Column(name = "fname")
  private String fname;
    @Column(name = "lname")
    private  String lname;
    @Column(name = "birthDate")
    private Date birthDate;

  public UserEntity (){

  }

     public UserEntity(String email, String fname, String lname, String birthDate) {
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        setBirthDate( birthDate );
    }

    @Override
    public String toString() {
        return  "UserEntity{" +
                "email='" + email + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    public void setBirthDate(String birthDate) {
        SimpleDateFormat birthDateFormat = new SimpleDateFormat( "dd.MM.yyyy" );
        try {
            this.birthDate = birthDateFormat.parse( birthDate );
        } catch (ParseException e) {
            System.out.println( "Date type not valid. Please insert in format: dd.MM.yyyy" );
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity user = (UserEntity) o;
        return Objects.equals( fname, user.fname ) &&
                Objects.equals( lname, user.lname ) &&
                Objects.equals( birthDate, user.birthDate );
    }

    @Override
    public int hashCode() {
        return Objects.hash( fname, lname, birthDate );
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
