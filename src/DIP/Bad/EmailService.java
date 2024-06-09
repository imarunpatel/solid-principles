package DIP.Bad;

//In this example, the high-level EmailService class directly depends on the low-level GmailService class, which violates the DIP.

public class EmailService {
    private GmailService gmailService;

    public EmailService() {
        this.gmailService = new GmailService();
    }

    public void sendEmail(String message) {
        gmailService.sendEmail(message);
    }

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmail("Hello World");
    }
}
