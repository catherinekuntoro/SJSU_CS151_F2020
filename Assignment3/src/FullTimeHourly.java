public class FullTimeHourly extends FullTimeEmployee {

    private Double overtimePay;

    public FullTimeHourly() {
        super();
        overtimePay = 20.0;

    }

    public FullTimeHourly(String firstName, String lastName, Address addr, int id,
                          Double basePay, Double overtime) {
        super(firstName, lastName, addr, id, basePay);
        this.overtimePay = overtime;

    }

    Double computePay(Double numHrs) {
        if (numHrs > 40) {
            Double overtimeHours = numHrs - 40;
            return getBasePay() * 40 + getOvertimePay() * overtimeHours;

        } else {
            return getBasePay() * numHrs;
        }
    }

    public String toString() {
        return "I am a full time hourly worker. My name is " + getFirstName() + " " + getLastName() +
                ", my Address is " + getAddress() + " , my ID is " +
                getId() + ", base pay is " + getBasePay() +
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

    public Double getOvertimePay() {
        return overtimePay;
    }

    public void setOvertime(Double overtimePay) {
        this.overtimePay = overtimePay;
    }


}
