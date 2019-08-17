package de.oette.course.H06;

/**
 * Do not change this class!
 */
public class HxxCustomerService {

    private final HxxEmailService emailService;

    public HxxCustomerService(HxxEmailService messageSender) {
        this.emailService = messageSender;
    }

    public void sendNotification(String sender, String message) {
        emailService.sendOutgoingMessage(sender, message);
    }


    public void receiveCustomerResponse(String receiver, String text) {
        responseListener.responseResponseReceived(receiver, text);
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
