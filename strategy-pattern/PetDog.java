public class PetDog extends Dog {
    public PetDog() {
        barkBehavior = new MuteBark();
        eatBehavior = new ProteinDiet();
    }

    public void display() {
        System.out.println("I'm a pet Dog");
    }
}
