public abstract class FullTimeEmployee extends Employee {

    private Double basePay;

    public FullTimeEmployee() {
        basePay = 20.0;
    }

    public FullTimeEmployee(String firstName, String lastName, Address address,
                            int id, Double basePay) {
        super(firstName, lastName, address, id);
        this.basePay = basePay;
    }

    public Double getBasePay() {
        return basePay;
    }

    public void setBasePay(Double basePay) {
        this.basePay = basePay;
    }
}
