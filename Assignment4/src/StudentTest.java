public class StudentTest {

    public static void main(String[] args) {
        Course cs151 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");
        Student john = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science", cs151);
        Student johnClone = null;

        try {
            johnClone = (Student) john.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        john.printInfo();
        System.out.println();
        johnClone.printInfo();

        //checking if deep copy
        System.out.println();
        System.out.println("Checking if deep copy-----------");

        john.setFirstName("not longer john");
        john.getCourse().setCourseName("CS 147");
        john.printInfo();
        System.out.println();
        johnClone.printInfo();

        //john's name is now "not longer john", but johnClone's name is still John.
        //So, deep copy
        //John's class name is CS 147, vs johnClone is CS151

    }

}
