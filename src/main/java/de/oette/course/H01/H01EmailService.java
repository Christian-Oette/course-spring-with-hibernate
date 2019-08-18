package de.oette.course.H01;

import org.springframework.stereotype.Service;

@Service
public class H01EmailService {

    private final H01CustomerService customerService;

    public H01EmailService(H01CustomerService customerService) {
        this.customerService = customerService;
    }

    public void sendOutgoingMessage(String sender, String text) {
        System.out.println(String.format("Simulate sending from %s: %s", sender, text));
    }

    public void receiveIncomingMessage(String receiver, String text) {
        customerService.receiveCustomerResponse(receiver, text);
    }
}
