package de.oette.course.K01.entities;

import de.oette.course.K01.entities.K01Address;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class K01Person {

    @Id
    @GeneratedValue
    long id;

    private String firstName;

    private String lastName;

    private Gender gender;

    private LocalDate birthday;

    @OneToOne(cascade = CascadeType.ALL)
    private K01Address address;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public K01Address getAddress() {
        return address;
    }

    public void setAddress(K01Address address) {
        this.address = address;
    }

    public void setBirthday(LocalDate birthDay) {
        this.birthday = birthDay;
    }

    public static enum Gender {
        MALE,
        FEMALE,
        OTHER
    }
}
