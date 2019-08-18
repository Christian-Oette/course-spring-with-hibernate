package de.oette.course.H05;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class H05EmailService {

    final ApplicationEventPublisher applicationEventPublisher;

    public H05EmailService(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void sendOutgoingMessage(String sender, String text) {
        System.out.println(String.format(
                "Simulate message send from %s with messsage %s: ", sender, text));
    }

    public void receiveIncomingMessage(String receiver, String text) {
        applicationEventPublisher.publishEvent(new IncomingMessageEvent(this,receiver, text));
    }
}
