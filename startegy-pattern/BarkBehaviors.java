class PlayfulBark implements BarkBehavior {
    public void bark() {
        System.out.println("Bark! Bark!");
    }
}

class Growl implements BarkBehavior {
    public void bark() {
        System.out.println("This is a growl");
    }
}

class MuteBark implements BarkBehavior {
    public void bark() {
        System.out.println("This is a mute bark");
    }
}