public class EmployeeTest {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Smith", 101, 35.0);
        try {
            System.out.println(john.computePay(40)); //1400.0
            System.out.println(john.computePay(23)); //805.0
            System.out.println(john.computePay(1)); //35.0
            System.out.println(john.computePay(0)); //0
            System.out.println(john.computePay(-5)); //number format exception

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(john.computePay(45)); //too many hours exception
        } catch (TooManyHoursWorkedException e) {
            System.out.println(e.getMessage());
        }
    }
}
