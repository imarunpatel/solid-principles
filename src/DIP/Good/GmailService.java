package DIP.Good;

public class GmailService implements EmailProvider {
    @Override
    public void sentEmail(String message) {
        System.out.println("Sending email via Gmail: " + message);
    }
}
