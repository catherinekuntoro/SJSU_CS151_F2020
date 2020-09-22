public class PartTimeHourly extends Employee {
    private Double baseHourlyPay;

    public PartTimeHourly() {
        super();
        baseHourlyPay = 15.0;
    }

    public PartTimeHourly(String firstName, String lastName, Address address,
                          int id, Double baseHourlyPay) {
        super(firstName, lastName, address, id);
        this.baseHourlyPay = baseHourlyPay;
    }

    @Override
    public String toString() {
        return "I am a part time hourly worker. My name is " + getFirstName() + " " + getLastName() +
                ", my Address is " + getAddress() + " , my ID is " +
                getId() + ", pay per hour is " + getHourlyPay() +
                ", my education level is " + getEducationLevel() +
                ". Am I using direct deposit? " + getDirectDeposit();
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(toString() + ". My SSN is " + getSSN());
        } else {
            System.out.println(toString());
        }
    }

    public Double computePay(int numHrs) {
        if (numHrs <= 40) {
            return numHrs * getHourlyPay();
        }

        return -1.0;
    }

    public double getHourlyPay() {
        return baseHourlyPay;
    }

    public void setHourlyPay(double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }
}
