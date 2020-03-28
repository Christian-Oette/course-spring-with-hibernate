package de.oette.course.J01;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
// Add scope here!
public class ProxyScopedService {

    private final String randomNumber;

    public ProxyScopedService() {
        this.randomNumber = RandomStringUtils.randomNumeric(3);
    }

    public String getRandomNumber() {
        return randomNumber;
    }
}
