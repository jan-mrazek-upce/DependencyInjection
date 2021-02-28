package cz.upce.inpia.dit;

public class EmailService {

    public EmailService() {
        System.out.println("New Instance email service");
    }

    public void sendEmail(String to, String body){
        System.out.println("Sending email to " + to + " with body " + body);
    }
}
