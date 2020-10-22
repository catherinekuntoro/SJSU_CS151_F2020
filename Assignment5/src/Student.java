import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Student {

    String firstName;
    String lastName;
    int age;
    double gpa;
    String major;
    String department;
    LinkedList<Course> courses;

    public Student() {
        firstName = "John";
        lastName = "Doe";
        age = 19;
        gpa = 3.0;
        major = "Computer Science";
        department = "College of Science";
        courses = new LinkedList<>();
    }

    public Student(String firstName, String lastName, int age, double gpa,
                   String major, String department,
                   LinkedList<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.courses = courses;
    }

    public boolean addCourse(Course addMe) {
        return courses.add(addMe);
    }

    public boolean removeCourse(Course removeMe) {
        return courses.remove(removeMe);
    }

    //parameter: ascending/descending, which course attribute
    //Attributes to compare: course Name, course description; department; time; weekday;
    public void sortCourses(boolean ascending, String courseAttribute) {

        courseAttribute = courseAttribute.replaceAll("\\s", ""); // \\s is single space in unicode

        //Possible options: String courseName, courseDescription; department; time; weekday;

        String finalCourseAttribute = courseAttribute;
        Collections.sort(courses, new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                if (finalCourseAttribute.equalsIgnoreCase("courseName")) {
                    if (ascending) {
                        return o1.getCourseName().compareTo(o2.getCourseName());
                    } else {
                        return o2.getCourseName().compareTo(o1.getCourseName());
                    }
                } else if (finalCourseAttribute.equalsIgnoreCase("courseDescription")) {
                    if (ascending) {
                        return o1.getCourseDescription().compareTo(o2.getCourseDescription());
                    } else {
                        return o2.getCourseDescription().compareTo(o1.getCourseDescription());
                    }
                } else if (finalCourseAttribute.equalsIgnoreCase("department")) {
                    if (ascending) {
                        return o1.getCourseDepartment().compareTo(o2.getCourseDepartment());
                    } else {
                        return o2.getCourseDepartment().compareTo(o1.getCourseDepartment());
                    }
                } else if (finalCourseAttribute.equalsIgnoreCase("time")) {
                    if (ascending) {
                        return o1.getTime().compareTo(o2.getTime());
                    } else {
                        return o2.getTime().compareTo(o1.getTime());
                    }
                } else if (finalCourseAttribute.equalsIgnoreCase("weekday")) {
                    if (ascending) {
                        return o1.getWeekday().compareTo(o2.getWeekday());
                    } else {
                        return o2.getWeekday().compareTo(o1.getWeekday());
                    }
                } else {
                    throw new IllegalArgumentException("Invalid input for attribute. Please try again");
                }
            }
        });

        for (Course c : courses) {
            System.out.println(c);
        }
    }

    //Setters and Getters below
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

    public LinkedList<Course> getCourses() {
        return courses;
    }

    public void setCourses(LinkedList<Course> courses) {
        this.courses = courses;
    }

    public static void main(String[] args) {

        Course c1 = new Course("Course B", "course B desc", "Department B", "13", "Tuesday");
        Course c2 = new Course("Course A", "course A desc", "Department A", "12", "Monday");

        LinkedList<Course> linkedList = new LinkedList<>();
        linkedList.add(c1);
        linkedList.add(c2);

        Student student = new Student();
        student.setCourses(linkedList);

        //Attributes to compare: course Name, course description; department; time; weekday;

        student.sortCourses(true, "Course Name");
        System.out.println();

        student.sortCourses(false, "course name");
        System.out.println();

        student.sortCourses(true, "course description");
        System.out.println();

        student.sortCourses(false, "course description");
        System.out.println();

        student.sortCourses(true, "department");
        System.out.println();

        student.sortCourses(false, "department");
        System.out.println();

        student.sortCourses(true, "time");
        System.out.println();

        student.sortCourses(false, "time");
        System.out.println();

        student.sortCourses(true, "week day");
        System.out.println();

        student.sortCourses(false, "week day");
        System.out.println();

    }
}
