public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student("John", "Smith", 20, 3.6f, "Computer Science", "Science");
        Student.Course course = student.new Course();
        course.printSchedule();

    }
}
