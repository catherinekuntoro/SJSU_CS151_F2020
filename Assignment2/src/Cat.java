public class Cat extends Animal implements Scratcher, Domesticated {
    public Cat(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public void walk() {
        System.out.println("Walking with human");
    }

    @Override
    public void greetHuman() {
        System.out.println("Hello human");
    }

    @Override
    public void scratch() {
        System.out.println("I am scratching");
    }

    @Override
    public void sound() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("carnivore");
    }

    @Override
    public String toString() {

        return "I am a cat" + super.toString();
    }
}
