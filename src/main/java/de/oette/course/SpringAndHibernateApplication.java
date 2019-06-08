package de.oette.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SuppressWarnings("SpellCheckingInspection")
@SpringBootApplication
@ComponentScan(basePackages = "de.oette.course.B02")
public class SpringAndHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAndHibernateApplication.class, args);
	}

}
