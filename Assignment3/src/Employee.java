public abstract class Employee extends Person {

    private int id;
    private String educationLevel;
    private boolean directDeposit;

    public Employee() {
        super();
        this.id = 1234;
        this.educationLevel = "Bachelor's";
        this.directDeposit = true;
    }

    public Employee(String firstName, String lastName, Address addr, int id) {
        super(firstName, lastName, addr);
        this.id = id;
        this.educationLevel = "Bachelor's";
        this.directDeposit = true;
    }

    //default constructor

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public boolean getDirectDeposit() {
        return directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }


}
