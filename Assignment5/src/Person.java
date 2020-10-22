import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public ArrayList<Person> sort(boolean ascending, String attribute, ArrayList<Person> people) {
        attribute = attribute.replaceAll("\\s", "");
        //options: firstNAME, lastName, age

        TreeSet<Person> personTreeSet;
        Comparator<Person> comparator;
        if (attribute.equalsIgnoreCase("firstName")) {
            if (ascending) {
                comparator = new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getFirstName().compareTo(o2.getFirstName());
                    }
                };
            } else {
                comparator = new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getFirstName().compareTo(o1.getFirstName());
                    }
                };
            }
        } else if (attribute.equalsIgnoreCase("lastName")) {
            if (ascending) {
                comparator = new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return (o1.getLastName().length() - o2.getLastName().length());
                    }
                };
            } else {
                comparator = new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return (o2.getLastName().length() - o1.getLastName().length());
                    }
                };
            }
        } else if (attribute.equalsIgnoreCase("age")) {
            if (ascending) {
                comparator = new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge() - o2.getAge();
                    }
                };
            } else {
                comparator = new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getAge() - o1.getAge();
                    }
                };
            }
        } else {
            throw new IllegalArgumentException("Invalid input for attribute");
        }

        people.sort(comparator);

        return new ArrayList<Person>(people);
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "First Name: " + getFirstName() +
                ", Last Name: " + getLastName() +
                ", Age: " + getAge();
    }

    public static void main(String[] args) {
        Person joe = new Person("Joe", "Smith", 40); //last name 5
        Person amy = new Person("Amy", "Gold", 32); //4
        Person tony = new Person("Tony", "Stork", 21); //5
        Person sean = new Person("Sean", "Irish", 24);
        Person tina = new Person("Tina", "Brock", 28);
        Person lenny = new Person("Lenny", "Hep", 18); //3

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(joe);
        arrayList.add(amy);
        arrayList.add(tony);
        arrayList.add(sean);
        arrayList.add(tina);
        arrayList.add(lenny);

        ArrayList<Person> answer = new ArrayList<>();

        System.out.println("Sorting by first name ascending:");
        System.out.println();

        answer = amy.sort(true, "First name", arrayList);
        for (Person p : answer) {
            System.out.println(p); //expect: amy joe lenny sean tina tony
        }
        answer.clear();
        System.out.println();
        System.out.println("Sorting by first name descending:");
        System.out.println();

        answer = amy.sort(false, "first name", arrayList);
        for (Person p : answer) {
            System.out.println(p); //expect: amy joe lenny sean tina tony
        }
        answer.clear();

        System.out.println();
        System.out.println("Sorting by last name ascending:");
        System.out.println();

        answer = amy.sort(true, "last name", arrayList);
        for (Person p : answer) {
            System.out.println(p); //expect: hep, gold, stork, brock, irish, smith
        }
        answer.clear();

        System.out.println();
        System.out.println("Sorting by last name descending:");
        System.out.println();

        answer = amy.sort(false, "last name", arrayList);
        for (Person p : answer) {
            System.out.println(p); //expect: smith, irish, brock, stork, gold, hep
        }
        answer.clear();

        System.out.println();
        System.out.println("Sorting by age ascending:");
        System.out.println();

        answer = amy.sort(true, "age", arrayList);
        for (Person p : answer) {
            System.out.println(p); //expect: 18 21 24 28 32 40
        }
        answer.clear();

        System.out.println();
        System.out.println("Sorting by age descending:");
        System.out.println();

        answer = amy.sort(false, "age", arrayList);
        for (Person p : answer) {
            System.out.println(p); //expect: 40 32 28 24 21 18
        }
        answer.clear();
    }
}
