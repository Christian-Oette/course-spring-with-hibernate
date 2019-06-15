package de.oette.course.G04;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Company {

    @Id
    private Long id = 1L;

    @OneToOne
    @JoinColumn(name = "fk_address")
    private Address address;

    @OneToMany(mappedBy = "company", cascade = CascadeType.PERSIST)
    private List<Client> clients = new ArrayList<>();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }
}
