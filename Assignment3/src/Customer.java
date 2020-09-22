public class Customer extends Person {

    private int customerID;
    private String paymentPreference;

    public Customer() {
        super();
        customerID = 1234;
        paymentPreference = "Cash";
    }

    public Customer(String firstName, String lastName, Address addr, int id) {
        super(firstName, lastName, addr);
        this.customerID = id;
        paymentPreference = "Cash";
    }

    @Override
    public String toString() {
        return "I am a customer. My name is " + getFirstName() + " " + getLastName() +
                ", my Address is " + getAddress() + ", my customer ID is " +
                getID() + ", my payment preference is " + getPaymentPreference();
    }

    public void introduce() {
        System.out.println(toString());
    }

    public int getID() {
        return customerID;
    }

    public void setID(int customerID) {
        this.customerID = customerID;
    }

    public String getPaymentPreference() {
        return paymentPreference;
    }

    public void setPaymentPreference(String paymentPreference) {
        this.paymentPreference = paymentPreference;
    }

}
