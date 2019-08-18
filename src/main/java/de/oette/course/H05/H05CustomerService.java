package de.oette.course.H05;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;


@Service
public class H05CustomerService {

    private final H05EmailService emailService;

    public H05CustomerService(H05EmailService messageSender) {
        this.emailService = messageSender;
    }

    public void sendNotification(String sender, String message) {
        emailService.sendOutgoingMessage(sender, message);
    }


    @EventListener(IncomingMessageEvent.class)
    public void receiveCustomerResponse(IncomingMessageEvent event) {
        responseListener.responseResponseReceived(event.getReceiver(), event.getText());
    }


    // == Helper implementation for unit test


    private ResponseListener responseListener;

    public void setResponseListener(ResponseListener responseListener) {
        this.responseListener = responseListener;
    }

    public interface ResponseListener {
        void responseResponseReceived(String receiver, String text);
    }
}
