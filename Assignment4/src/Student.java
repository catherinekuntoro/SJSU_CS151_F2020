public class Student implements Comparable<Student>, Cloneable {

    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    private String department;

    private Course course;

    public Student(String firstName, String lastName, int age, double gpa, String major, String department, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }

    @Override
    public int compareTo(Student that) {
        //Compare first name
        if (this.firstName.compareTo(that.firstName) != 0) {
            return this.firstName.compareTo(that.firstName);
        }

        //Compare last name
        else if (this.lastName.compareTo(that.lastName) != 0) {
            return this.lastName.compareTo(that.lastName);
        }
        //Compare age
        else if (this.age != that.age) {
            return (int) Math.signum(this.age - that.age);
        }
        //Compare GPA
        else if (this.gpa != that.gpa) {
            return (int) Math.signum(this.gpa - that.gpa);
        }
        //Compare major
        else if (this.major.compareTo(that.major) != 0) {
            return this.major.compareTo(that.major);
        }
        //Compare department
        else if (this.department.compareTo(that.department) != 0) {
            return this.department.compareTo(that.department);
        }
        //Compare Course
        else if (!this.course.equals(that.course)) {
            return this.course.compareTo(that.course);
        }
        //Must have same attributes
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        //if null
        if (obj == null) {
            return false;

        }

        //reference equality
        else if (obj == this) {
            return true;
        }

        //not even the same class
        else if (!(obj instanceof Course)) {
            return false;
        } else {
            Student that = (Student) obj;
            return this.compareTo(that) == 0;
        }
    }

    public void printInfo() {
        System.out.println("First name: " + getFirstName());
        System.out.println("Last name: " + getLastName());
        System.out.println("Age: " + getGpa());
        System.out.println("Major: " + getMajor());
        System.out.println("Department " + getDepartment());
        System.out.println("Course name: " + getCourse().getCourseName());
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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
