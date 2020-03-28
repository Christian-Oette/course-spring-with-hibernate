package de.oette.course.J01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScopeTestController {

    private ProxyScopedService proxyScopedService;
    private SingletonScopedService singletonScopedService;

    public ScopeTestController(ProxyScopedService proxyScopedService,
                               SingletonScopedService singletonScopedService) {
        this.proxyScopedService = proxyScopedService;
        this.singletonScopedService = singletonScopedService;
    }

    @GetMapping(value = "/randomNumbers")
    public String getRandomNumbers() {
        return proxyScopedService.getRandomNumber() + " - " + singletonScopedService.getRandomNumber();
    }

}
