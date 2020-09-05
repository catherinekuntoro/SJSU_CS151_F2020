public final class Product {

    private final String PRODUCTNAME;
    private final String PRODUCTDESCRIPTION;
    private final int PRODUCTPRICE;
    private final int MAXQUANTITY;

    public Product(String PRODUCTNAME, String PRODUCTDESCRIPTION,
                   int PRODUCTPRICE, int MAXQUANTITY) {
        this.PRODUCTNAME = PRODUCTNAME;
        this.PRODUCTDESCRIPTION = PRODUCTDESCRIPTION;
        this.PRODUCTPRICE = PRODUCTPRICE;
        this.MAXQUANTITY = MAXQUANTITY;
    }

    @Override
    public String toString() {
        return (getPRODUCTNAME() + " " + getPRODUCTDESCRIPTION() + " " +
                getPRODUCTPRICE() + " " + getMAXQUANTITY());
    }

    public String getPRODUCTNAME() {
        return PRODUCTNAME;
    }

    public String getPRODUCTDESCRIPTION() {
        return PRODUCTDESCRIPTION;
    }

    public int getPRODUCTPRICE() {
        return PRODUCTPRICE;
    }

    public int getMAXQUANTITY() {
        return MAXQUANTITY;
    }
}
