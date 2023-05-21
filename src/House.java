import java.util.ArrayList;

public class House extends RealProperty{
    public static int NOT_TAX_AREA = 300;
    private int floorNumber; //количество этажей
    ArrayList<Person>people = new ArrayList<>();// жильцы,

    public House(String cadastralNumber, double price, Person owner, double area, int floorNumber, ArrayList<Person>people) {
        super(cadastralNumber, price, owner, area);
        this.floorNumber = floorNumber;
        this.people = people;
    }

    @Override
    public double calculatePropertyTax (){
            if (!foRent()) {if ((getArea()-NOT_TAX_AREA)>0)
            {return (getArea()-NOT_TAX_AREA)*getStandatrTax()*getPrice();}}
        return getPrice()*getStandatrTax()*getArea();
    }

    @Override
    public boolean checkBenefit() {
        if (floorNumber<3){return true;}
        return false;
    }


    @Override
    public boolean foRent(){
        for (Person person: people
        ) { if (person.getLastName().equals(getOwner().getLastName()))
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "House {" +
                "Kn. (" + getCadastralNumber() + ")" +
                ", price-" + getPrice() +
                ", owner-" + getOwner() +
                ", area-" + getArea() + "floors-" + floorNumber + ", tenants:" + people.size() +
                '}';
    }
}
