package de.oette.course.K01.data;

import de.oette.course.K01.entities.K01Address;
import de.oette.course.K01.entities.K01Person;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.time.LocalDate;

@Component
@Transactional
public class K01DemoData {

    @PersistenceContext
    private EntityManager entityManager;

    @EventListener(ApplicationReadyEvent.class)
    public void createDemoPersons() {
        persistPerson("Ali", "Erkin", K01Person.Gender.MALE, LocalDate.of(2001, 9, 17),
                "Berlin"," Prenzlauer Berg", (short) 10465);

        persistPerson("Stefan", "Ericson", K01Person.Gender.MALE, LocalDate.of(1990, 3, 1),
                "Berlin"," Mitte", (short) 104782);

        persistPerson("Bob", "Miller", K01Person.Gender.MALE, LocalDate.of(1999, 5, 22),
                "Hamburg","Rotherbaum", (short) 20992);

        persistPerson("Anna", "Nawronski", K01Person.Gender.FEMALE, LocalDate.of(1997, 12, 5),
                "Frankfurt","Frankfurter Strasse", (short) 64848);
    }

    private void persistPerson(String firstname,
                               String lastname,
                               K01Person.Gender gender,
                               LocalDate birthDay,
                               String city,
                               String street,
                               short zipCode) {
        K01Address address = new K01Address();
        address.setCity(city);
        address.setStreet(street);
        address.setZipCode(zipCode);

        K01Person person = new K01Person();
        person.setBirthday(birthDay);
        person.setFirstName(firstname);
        person.setLastName(lastname);
        person.setAddress(address);
        person.setGender(K01Person.Gender.MALE);
        entityManager.persist(person);
    }
}
