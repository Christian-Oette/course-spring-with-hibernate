package de.oette.course.H05;


import org.springframework.stereotype.Service;

@Service
public class H05EmailService {

    public void sendOutgoingMessage(String sender, String text) {
        System.out.println(String.format(
                "Simulate message send from %s with messsage %s: ", sender, text));
    }

    public void receiveIncomingMessage(String receiver, String text) {

    }
}
