package de.oette.course.H04.customer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * curl -XPOST localhost:8080/create-customer
 * <p>
 * Refactor to @GetMapping if you can't use curl!
 * Then open browser and enter localhost:8080/create-customer
 */
@RestController
public class H04Controller {

    private final H04CustomerService customerService;

    public H04Controller(H04CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/create-customer")
    public void createCustomer() {

    }
}
