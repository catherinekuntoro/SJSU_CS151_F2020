public class Executive extends Employee {

    private Double yearlyBonus;
    private Double yearlyCompensation;

    public Executive() {
        super();
        yearlyBonus = 1000.0;
        yearlyCompensation = 1000.0;
    }

    public Executive(String firstName, String lastName, Address addr,
                     int id, Double pay, Double bonus) {
        super(firstName, lastName, addr, id);
        this.yearlyBonus = bonus;
        this.yearlyCompensation = pay;
    }

    public Double computePay() {
        return getYearlyCompensation() + getBonus();
    }

    @Override
    public String toString() {
        return "I am an Executive. My name is " + getFirstName() + " " + getLastName() +
                ", my Address is " + getAddress() + " , my ID is " +
                getId() + ", my yearly bonus is " + getBonus()
                + ", my yearly compensation is " + getYearlyCompensation() +
                ", my education level is " + getEducationLevel() +
                ". Am I using direct deposit? " + getDirectDeposit();
    }

    public void introduce(boolean displaySSN) {
        if (displaySSN) {
            System.out.println(this.toString() + ". My SSN is " +
                    getSSN());
        } else {
            System.out.println(this.toString());
        }
    }

    public Double getBonus() {
        return yearlyBonus;
    }

    public void setBonus(Double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public Double getYearlyCompensation() {
        return yearlyCompensation;
    }

    public void setYearlyCompensation(Double yearlyCompensation) {
        this.yearlyCompensation = yearlyCompensation;
    }

}
