package com.kft.crud.domain;

import com.kft.crud.domain.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Msolomon on 5/17/2018.
 */
@Entity
@Table()
public class Person extends AbstractEntity {

    private String firstName;

    private String middleName;

    private String lastName;

    private Date dateOfBirth;

    @Column(name = "GENDER")
    private String gender;

    private String identificationNumber;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
}
