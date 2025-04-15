package di;

public class ZaloService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Zalo sent: " + message);
    }
}
