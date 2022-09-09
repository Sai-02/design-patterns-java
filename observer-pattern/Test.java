public class Test {
    public static void main(String[] args) {
        Channel freecodecamp = new Channel("freecodecamp");
        Subscriber s1 = new Subscriber("Neeraj");
        Subscriber s2 = new Subscriber("Ayush");
        Subscriber s3 = new Subscriber("Sankalp");
        Subscriber s4 = new Subscriber("Vishal");
        Subscriber s5 = new Subscriber("Deepansh");

        freecodecamp.subscribe(s1);
        freecodecamp.subscribe(s2);
        freecodecamp.subscribe(s3);
        freecodecamp.subscribe(s4);
        freecodecamp.subscribe(s5);

        freecodecamp.uploadContent("Design Patterns");
    }
}
