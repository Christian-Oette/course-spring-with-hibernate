package de.oette.course.H06;


public class HxxEmailService {

    public void sendOutgoingMessage(String sender, String text) {
        System.out.println(String.format(
                "Simulate message send from %s with messsage %s: ", sender, text));
    }

    public void receiveIncomingMessage(String receiver, String text) {

    }
}
