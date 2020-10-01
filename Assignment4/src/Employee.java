public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private double hourlyPay;

    public Employee(String firstName, String lastName, int id, double hourlyPay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.hourlyPay = hourlyPay;
    }

    public double computePay(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new NumberFormatException("Invalid entry for hours worked. Please enter a positive integer number for the hours you worked.");
        } else if (hoursWorked > 40) {
            throw new TooManyHoursWorkedException("Too many hours worked. Please enter a maximum integer of 40 hours.");
        }
        return hoursWorked * getHourlyPay();
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
}
