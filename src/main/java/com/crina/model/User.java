package com.crina.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "t_user")
public class User extends BaseEntity {

    @Size(min = 3, max = 20)
    private String name;
    private String lastName;
    private String firstName;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @NotNull
    @Email
    private String emailAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String[] partsOfName = name.split(" ");
        if (partsOfName.length > 1) {
            this.lastName = partsOfName[0];
            this.firstName = partsOfName[1];
        }
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
