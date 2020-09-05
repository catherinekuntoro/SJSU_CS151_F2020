public class Racoon extends Animal implements Scratcher {
    public Racoon(String type, String name, int age, String gender, String environment, int speed) {
        super(type, name, age, gender, environment, speed);
    }

    @Override
    public void move() {
        System.out.println("Sometimes I walk on four legs, sometimes I walk on two legs.");
    }

    @Override
    public void scratch() {
        System.out.println("I am scratching");
    }

    @Override
    public void sound() {
        System.out.println("kreasdfasdfawef");
    }

    @Override
    public String toString() {
        return "I am a raccoon" + super.toString();
    }
}
