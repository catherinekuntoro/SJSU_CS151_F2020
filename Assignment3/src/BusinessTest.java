public class BusinessTest {

    public static void main(String[] args) {
        Address addrOne = new Address(123, "Street One", "City One", "12345", "State1");
        Address addrTwo = new Address(456, "Street Two", "City Two", "67891", "State2");

        Executive executive1 = new Executive("Tom", "Nook", addrOne, 123, 100.20, 100.0);
        executive1.setDirectDeposit(true);
        executive1.setSSN("123456789");
        executive1.setEducationLevel("Bachelor's Degree");
        executive1.introduce(true);
        System.out.println("Payment is: " + executive1.computePay()); //200.2

        Executive executive2 = new Executive("Isabelle", "Dog", addrTwo, 456, 200.20, 100.30);
        executive2.setDirectDeposit(false);
        executive1.setSSN("123456789");
        executive2.setEducationLevel("Master's Degree");
        executive2.introduce(false);
        System.out.println("Payment is: " + executive2.computePay()); //300.5

        System.out.println();
        //--------------------------------------------------------------------------------------

        FullTimeSalaried fts1 = new FullTimeSalaried("Redd", "Fox", addrOne, 123, 104.0);
        fts1.setDirectDeposit(false);
        fts1.setSSN("123456789");
        fts1.setEducationLevel("Master's Degree");
        fts1.introduce(true);
        System.out.println("Payment is: " + fts1.computePay(30)); //60

        FullTimeSalaried fts2 = new FullTimeSalaried("Leif", "Sloth", addrTwo, 456, 156.5);
        fts2.setDirectDeposit(true);
        fts2.setSSN("987654321");
        fts2.setEducationLevel("Bachelor's Degree");
        fts2.introduce(false);
        System.out.println("Payment is: " + fts2.computePay(40)); // 120.3846154

        System.out.println();
        //--------------------------------------------------------------------------------------

        FullTimeHourly fth1 = new FullTimeHourly("Timmy", "Nook", addrOne, 123, 100.0, 100.0);
        fth1.setDirectDeposit(true);
        fth1.setSSN("987654321");
        fth1.setEducationLevel("High School Degree");
        fth1.introduce(true);
        System.out.println("Payment is: " + fth1.computePay(55.5)); // 5550

        FullTimeHourly fth2 = new FullTimeHourly("Tommy", "Nook", addrTwo, 456, 150.0, 101.0);
        fth2.setDirectDeposit(false);
        fth2.setSSN("123456789");
        fth2.setEducationLevel("High School Degree");
        fth2.introduce(false);
        System.out.println("Payment is: " + fth2.computePay(30.5)); // 4575

        System.out.println();
        //--------------------------------------------------------------------------------------

        PartTimeHourly pth1 = new PartTimeHourly("Mable", "Able", addrOne, 123, 30.0);
        pth1.setDirectDeposit(true);
        pth1.setSSN("987654321");
        pth1.setEducationLevel("Bachelor's Degree");
        pth1.introduce(true);
        System.out.println("Payment is: " + pth1.computePay(50)); // -1
        System.out.println("Payment is: " + pth1.computePay(40)); // 1200

        PartTimeHourly pth2 = new PartTimeHourly("Sable", "Able", addrTwo, 456, 35.0);
        pth2.setDirectDeposit(true);
        pth2.setSSN("987654321");
        pth2.setEducationLevel("Bachelor's Degree");
        pth2.introduce(false);
        System.out.println("Payment is: " + pth2.computePay(35)); // 1225

        System.out.println();
        //--------------------------------------------------------------------------------------

        Contractor ctr1 = new Contractor("Freckle", "Duck", addrOne, 123, 60.0);
        ctr1.setDirectDeposit(true);
        ctr1.setSSN("987654321");
        ctr1.setEducationLevel("Phd Degree");
        ctr1.introduce(true);
        System.out.println("Payment is: " + ctr1.computePay(60)); // 3600

        Contractor ctr2 = new Contractor("Olive", "Bear", addrTwo, 456, 65.8);
        ctr2.setDirectDeposit(false);
        ctr2.setSSN("987654321");
        ctr2.setEducationLevel("Master's Degree");
        ctr2.introduce(false);
        System.out.println("Payment is: " + ctr2.computePay(53)); //3487.4

        System.out.println();
        //--------------------------------------------------------------------------------------

        Customer cstm1 = new Customer("Diana", "Deer", addrOne, 123);
        cstm1.setPaymentPreference("Cash");
        cstm1.setID(456);
        cstm1.introduce();

        Customer cstm2 = new Customer("Coco", "Rabbit", addrTwo, 778);
        cstm2.setPaymentPreference("Debit");
        cstm2.introduce();

    }


}
