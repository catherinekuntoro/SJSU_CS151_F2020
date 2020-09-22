public class FullTimeSalaried extends FullTimeEmployee {

    public FullTimeSalaried() {
        super();
    }

    public FullTimeSalaried(String firstName, String lastName, Address add, int id, Double salary) {
        super(firstName, lastName, add, id, salary);
    }

    Double computePay(int numWeeks) {
        return (getBasePay() / 52) * numWeeks;
    }

    public String toString() {
        return "I am a full time salaried worker. My name is " + getFirstName() + " " + getLastName() +
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
}
