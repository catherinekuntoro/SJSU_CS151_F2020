public class Dog extends Animal implements Domesticated {
    public Dog(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    public void bark() {
        System.out.println("bark");
    }

    @Override
    public String toString() {

        return "I am a dog" + super.toString();
    }

    @Override
    public void walk() {
        System.out.println("Walking with human");
    }

    @Override
    public void greetHuman() {
        System.out.println("Hello human");
    }
}
