package de.oette.course.G04;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private Long id;

    private List<Client> clients;

    public List<Client> getClients() {
        return clients;
    }
}
