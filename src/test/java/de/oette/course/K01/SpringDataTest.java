package de.oette.course.K01;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DataJpaTest
@ExtendWith(SpringExtension.class)
@EntityScan(value = "de.oette.course.K01")
@ComponentScan(value = "de.oette.course.K01")
public class SpringDataTest {

    @Autowired
    private K01PersonService personService;

    @Test
    public void test() {

    }
}
