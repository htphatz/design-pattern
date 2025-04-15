package di;

public class Main {
    public static void main(String[] args) {
        // Create instances of message services
        MessageService emailService = new EmailService();
        MessageService smsService = new SmsService();
        MessageService zaloService = new ZaloService();

        // Create a message controller with Email service
        MessageController emailController = new MessageController(emailService);
        emailController.sendMessage("Hello via Email!");

        // Create a message controller with SMS service
        MessageController smsController = new MessageController(smsService);
        smsController.sendMessage("Hello via SMS!");

        // Create a message controller with Zalo service
        MessageController zaloController = new MessageController(zaloService);
        zaloController.sendMessage("Hello via Zalo!");
    }
}
