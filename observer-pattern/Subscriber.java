public class Subscriber {
    String name;

    Subscriber(String name) {
        this.name = name;
    }

    public void message(String title) {
        System.out.println("Hey " + name + ", new content " + title + " is uploaded!!");
    }
}