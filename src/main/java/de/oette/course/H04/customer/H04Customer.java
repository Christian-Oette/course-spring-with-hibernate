package de.oette.course.H04.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class H04Customer {

    @Id
    @GeneratedValue
    private Long id;
}
