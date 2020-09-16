public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String ssn;
    private String address;
    private String gender;
    private Double weight;

    public Person(String firstName, String lastName, int age,
                  String ssn, String address,
                  String gender, Double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
        this.weight = weight;
    }

    //getter and setter methods for first name
    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //getter and setter methods for last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //getter and setter methods for social security number
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    //getter setter address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "I am a person. My name is " + getFirstName() + " " + getLastName()
                + ", I am " + getAge() + " years old." +
                "My SSN is " + getSsn() + " and I live in " + getAddress() + ". I am a " + getGender() +
                " and I weigh " + getWeight() + ".";
    }

    public void introduce() {
        System.out.println(toString());
    }
}
