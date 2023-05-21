public class Garage extends RealProperty{

    private int numberOfParkingSpaces;//количество машиномест.


    public Garage(String cadastralNumber, double price, Person owner, double area, int numberOfParkingSpaces) {
        super(cadastralNumber, price, owner, area);
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    @Override
    public double calculatePropertyTax (){
        if (checkBenefit()){
            return 0;
        } return getPrice()*getStandatrTax();
    }


    @Override
    public boolean checkBenefit() {
        return getOwner().getAge()>60 || getOwner().getAge()<18;
    }


    @Override
    public boolean foRent(){
        return true;
    }

    @Override
    public String toString() {
        return "Garage {" +
                "Kn. (" + getCadastralNumber() + ")" +
                ", price-" + getPrice() +
                ", owner-" + getOwner() +
                ", area-" + getArea() + ", parking spaces- " + numberOfParkingSpaces +
                '}';
    }
}
