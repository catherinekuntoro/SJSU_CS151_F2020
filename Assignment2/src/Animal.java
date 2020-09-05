public class Animal {

    private String type;
    private String name;
    private int age;
    private String gender;
    private String environment;
    private int speed;

    public Animal(String type, String name, int age, String gender,
                  String environment, int speed) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.environment = environment;
        this.speed = speed;
    }

    public void move() {
        System.out.println("walk on four legs");
    }

    public void sound() {
        System.out.println("woof");
    }

    public void eat() {
        System.out.println("omnivores");
    }

    public void sleep() {
        System.out.println("zzz");
    }


    @Override
    public String toString() {
        String b = ", my type is: " + getType();
        String c = ", my name is: " + getName();
        String d = ", my age is: " + getAge();
        String e = ", my gender is: " + getGender();
        String f = ", my environment is: " + getEnvironment();
        String g = ", my speed is: " + getSpeed();
        return b + c + d + e + f + g;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
