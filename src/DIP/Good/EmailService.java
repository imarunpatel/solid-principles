package DIP.Good;

public class EmailService {
    private EmailProvider emailProvider;

    public EmailService(EmailProvider emailProvider) {
        this.emailProvider = emailProvider;
    }

    public void sendEmail(String message){
        emailProvider.sentEmail(message);
    }
}
