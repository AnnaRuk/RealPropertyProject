public class Land extends RealProperty{
    private Purpose purpose;
    static double INDUSTRIAL_TAX = 0.01;
    static double AGRICULTURA_TAX = 0.0005;

    public Land(String cadastralNumber, double price, Person owner, double area, Purpose purpose) {
        super(cadastralNumber, price, owner, area);
        this.purpose = purpose;
    }

    @Override
    public double calculatePropertyTax (){
        switch (purpose){
            case INDUSTRIALLAND: return getPrice()*INDUSTRIAL_TAX;
            case SETTLEMENTSLAND: return getPrice()*getStandatrTax();
    }
    return getPrice()*AGRICULTURA_TAX;
    }

    @Override
    public boolean checkBenefit() {
        return false;
    }

    @Override
    public boolean foRent(){
        return true;
    }

    @Override
    public String toString() {
        return "Land{" +
                "Kn. (" + getCadastralNumber() + ")" +
                ", price-" + getPrice() +
                ", owner-" + getOwner() +
                ", area-" + getArea() + ", purpose-" + purpose +
                '}';
    }


}
