package de.oette.course.K01;

import org.springframework.stereotype.Controller;

@Controller
public class K01Controller {

    private final K01PersonService k01PersonService;

    public K01Controller(K01PersonService k01PersonService) {
        this.k01PersonService = k01PersonService;
    }

}
