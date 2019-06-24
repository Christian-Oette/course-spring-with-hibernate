package de.oette.course.G04;


import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "street_and_number")
    private String streetAndNumber = RandomStringUtils.randomAlphanumeric(10);

    @Column(name = "zip_code_and_city")
    private String zipCodeAndCity = RandomStringUtils.randomAlphanumeric(10);


    @Override
    public String toString() {
        return "Address{id=" + id +", streetAndNumber='" + streetAndNumber + ", zipCodeAndCity='" + zipCodeAndCity + '}';
    }

}
