public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private float gpa;
    private String major;
    private String department;

    //constructor
    public Student(String firstName, String lastName,
                   int age, float gpa, String major,
                   String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
    }

    class Course {
        public void printSchedule() {
            //CS151 Tue/Thur 6-7:15
            System.out.println("Eng101 Mon/Wed 10-11:15");
            System.out.println("Hist100 Tue/Thur 1:30-2:45");
            System.out.println("CS151 Tue/Thur 6-7:15");
        }

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

    //getter and setter methods for GPA
    public float getGPA() {
        return gpa;
    }

    public void setGPA(float gpa) {
        this.gpa = gpa;
    }

    //getter and setter methods for major
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    //getter and setter methods for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
