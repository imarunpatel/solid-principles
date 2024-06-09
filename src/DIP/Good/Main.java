package DIP.Good;

//In this example, the EmailService class depends on an abstraction (EmailProvider interface) rather than a concrete implementation. This adheres to the DIP because high-level modules depend on abstractions.

public class Main {
    public static void main(String[] args) {
        EmailProvider gmailService = new GmailService();
        EmailService emailService = new EmailService(gmailService);
        emailService.sendEmail("Hello World");
    }
}
