public class Whale extends Animal implements Swimmer {
    public Whale(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public void move() {
        System.out.println("swim");
    }

    @Override
    public void sound() {
        System.out.println("woooooooo");
    }

    @Override
    public void eat() {
        System.out.println("carnivore");
    }

    @Override
    public String toString() {
        return "I am a whale" + super.toString();
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }
}
