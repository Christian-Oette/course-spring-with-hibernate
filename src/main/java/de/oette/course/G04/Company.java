package de.oette.course.G04;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {

    @Id
    private Long id = 1L;

    @OneToOne
    @JoinColumn(name = "fk_address")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }
}
