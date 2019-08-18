package de.oette.course.H01;

import org.springframework.stereotype.Service;

@Service
public class H01CustomerService {

    private final H01EmailService emailService;

    public H01CustomerService(H01EmailService messageSender) {
        this.emailService = messageSender;
    }

    public void sendNotification() {
        // ...
        emailService.sendOutgoingMessage("Tom", "Message");
        // ...
    }


    public void receiveCustomerResponse(String receiver, String text) {

    }
}
