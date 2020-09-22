public class Contractor extends Employee {

    private Double basePay;

    public Contractor() {
        super();
        basePay = 15.0;
    }

    public Contractor(String firstName, String lastName, Address addr,
                      int id, Double pay) {
        super(firstName, lastName, addr, id);
        this.basePay = pay;
    }

    public Double computePay(int numHrs) {
        return getBasePay() * numHrs;
    }

    public String toString() {
        return "I am a contractor. My name is " + getFirstName() + " " + getLastName() +
                ", my Address is " + getAddress() + " , my ID is " +
                getId() + ", my base pay is " + getBasePay() +
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

    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }


}
