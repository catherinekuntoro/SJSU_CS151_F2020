public class Employee extends Person {

    private int id;
    private String status;
    private double basePay;

    //add employee id,
    //employee status (can be contractor, full time, part time),
    // pay amount (employee's base pay).
    public Employee(String firstName, String lastName, int age,
                    String socialSecurityNum, String address,
                    String gender, double weight,
                    int id, String status,
                    double basePay) {
        super(firstName, lastName, age, socialSecurityNum, address, gender, weight);
        this.id = id;
        this.status = status;
        this.basePay = basePay;
    }

    //unit worked = #hrs for part time/contract
    //            = #weeks for full time
    public double calculatePay(double unitsWorked) {
        if (status.equalsIgnoreCase("full time")) {
            return (getBasePay() / 52) * (unitsWorked);
        } else {
            return getBasePay() * unitsWorked;
        }
    }

    @Override
    public void introduce() {
        super.introduce();
        String payUnit;
        if (getStatus().equalsIgnoreCase("full time")) {
            payUnit = "/yr";
        } else {
            payUnit = "/hr";
        }

        System.out.println(super.getFirstName() + " " +
                super.getLastName() + ", a " +
                getStatus() + ", pay is " +
                getBasePay() + payUnit + ", should get paid: "
        );

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }
}
