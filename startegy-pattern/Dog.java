interface EatBehavior {
    public void eat();
}

interface BarkBehavior {
    public void bark();
}

public abstract class Dog {
    EatBehavior eatBehavior;
    BarkBehavior barkBehavior;

    public Dog() {
    }

    public void doBark() {
        barkBehavior.bark();
    }

    public void doEat() {
        eatBehavior.eat();
    }
}