public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private Address address;

    public Person() {
        this.firstName = "John";
        this.lastName = "Smith";
        address = null;
    }

    public Person(String firstName, String lastName, Address addressMe) {
        this.firstName = firstName;
        this.lastName = lastName;
        address = addressMe;
    }

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

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String ssn) {
        this.ssn = ssn;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressMe) {
        address = addressMe;
    }
}
