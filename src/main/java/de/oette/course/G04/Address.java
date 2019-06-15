package de.oette.course.G04;


import org.apache.commons.lang3.RandomStringUtils;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "street_and_number")
    private String streetAndNumber = RandomStringUtils.randomAlphanumeric(10);

    @Column(name = "zip_code_and_city")
    private String zipCodeAndCity = RandomStringUtils.randomAlphanumeric(10);


    @OneToOne(mappedBy = "address")
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Address{id=" + id +", streetAndNumber='" + streetAndNumber + ", zipCodeAndCity='" + zipCodeAndCity + '}';
    }

}
