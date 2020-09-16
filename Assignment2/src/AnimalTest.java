public class AnimalTest {
    public static void main(String[] args) {


        Cat c = new Cat("Cat", "cat", 12, "f", "Domestic", 2);
        System.out.println(c.toString());
        c.move();
        c.sound();
        c.eat();
        c.sleep();
        c.walk();
        c.greetHuman();
        c.scratch();

        Dog d = new Dog("Dog", "dog", 13, "f", "Domestic", 3);
        System.out.println(d.toString());
        d.move();
        d.sound();
        d.eat();
        d.sleep();
        d.walk();
        d.greetHuman();
        d.bark();

        System.out.println();

        Racoon r = new Racoon("Racoon", "racoon", 14, "m", "Forest", 4);
        System.out.println(r.toString());
        r.move();
        r.sound();
        r.eat();
        r.sleep();
        r.scratch();

        System.out.println();

        Whale w = new Whale("Whale", "whale", 15, "m", "Ocean", 10);
        System.out.println(w.toString());
        w.move();
        w.sound();
        w.eat();
        w.sleep();
        w.swim();

    }
}
