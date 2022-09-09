import java.util.*;

public class Channel {
    String name;

    Channel(String name) {
        this.name = name;
    }

    List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    public void unsubscribe(Subscriber sub) {
        subscribers.remove(sub);
    }

    public void uploadContent(String title) {
        System.out.println("Content Uploaded!!");
        sendNotification(title);
    }

    public void sendNotification(String title) {
        for (Subscriber subscriber : subscribers) {
            subscriber.message(title);
        }
    }
}
