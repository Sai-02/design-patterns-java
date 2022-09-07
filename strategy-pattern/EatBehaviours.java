class NormalDiet implements EatBehavior {
    public void eat() {
        System.out.println("This is a normal diet");
    }
}

class ProteinDiet implements EatBehavior {
    public void eat() {
        System.out.println("This is a protein diet");
    }
}