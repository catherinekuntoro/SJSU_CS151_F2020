public class EmployeeTest {

    public static void main(String[] args) {
        //Testing Person
        Person p = new Person("John", "Doe", 11, "1 ssn", "1addr", "Female", 9);
        p.introduce();

        System.out.println();

        //Joe Smith
        Employee a = new Employee("Joe", "Smith", 10, "123ssn", "123addr",
                "Male", 10.1, 456, "contractor", 60);
        a.introduce();
        System.out.println(a.calculatePay(30) + " for working 30 hours");

        System.out.println();

        //Lisa Gray
        Employee b = new Employee("Lisa", "Gray", 19, "1234ssn", "1234addr",
                "Male", 10.1, 456, "full time", 110000);
        b.introduce();
        System.out.println(b.calculatePay(2) + " for working 2 weeks");

        System.out.println();

        //Timothy Briggs
        Employee c = new Employee("Timothy", "Briggs", 19, "1235ssn", "1235addr",
                "Male", 10.1f, 456, "full time", 80000);
        c.introduce();
        System.out.println(c.calculatePay(4) + " for working 4 weeks");

        System.out.println();

        //George Wallace
        Employee d = new Employee("George", "Wallace", 17, "1235ssn", "1235addr",
                "Male", 10.1f, 456, "part time", 20);
        d.introduce();
        System.out.println(d.calculatePay(25) + " for working 25 hours");

        System.out.println();

        //Amy Student
        Employee e = new Employee("Amy", "Student", 15, "1235ssn", "123a5ddr",
                "Male", 10.1f, 456, "contractor", 45);
        e.introduce();
        System.out.println(e.calculatePay(45) + " for working 45 hours");

        System.out.println();

    }
}
