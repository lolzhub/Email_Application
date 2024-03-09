package EmailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("John", "Doe");
        email.setMailboxCapacity(500);
        email.setAlternateEmail("abc@pqr.xyz.com");
        System.out.println("------------------------------");
        System.out.println(email.showInfo());
    }
}