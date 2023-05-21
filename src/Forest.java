public class Forest extends RealProperty {

    private boolean isProtectedZone; // является природоохранной зоной или нет
    static int TAX_PROTECT_FOREST = 10000;

    public Forest(String cadastralNumber, double price, Person owner, double area, boolean isProtectedZone) {
        super(cadastralNumber, price, owner, area);
        this.isProtectedZone = isProtectedZone;
    }

    @Override
    public double calculatePropertyTax (){
        if (!isProtectedZone){
        return getPrice()*getStandatrTax();
    }
        return getPrice()*getStandatrTax() + TAX_PROTECT_FOREST;
    }


    @Override
    public boolean checkBenefit() {
        return false;
    }

    @Override
    public boolean foRent(){
        return false;
    }
    @Override
    public String toString() {
        return "Forest {" +
                "Kn. (" + getCadastralNumber() + ")" +
                ", price-" + getPrice() +
                ", owner-" + getOwner() +
                ", area-" + getArea() + (isProtectedZone? ". PROTECTED ZONE": ". USUAL ZONE") +
                '}';
    }
}
