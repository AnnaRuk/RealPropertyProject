import java.util.ArrayList;

public class Apartment extends RealProperty {
    public static int NOT_TAX_AREA = 60;
    ArrayList<Person> people = new ArrayList<>();//жильцы,
    private int roomNumber;  //количество комнат.

    public Apartment(String cadastralNumber, double price, Person owner, double area, int roomNumber, ArrayList<Person> people) {
        super(cadastralNumber, price, owner, area);
        this.roomNumber = roomNumber;
        this.people = people;
    }

    @Override
    public double calculatePropertyTax() {
        if (!checkBenefit()){
        if (foRent()) {return getPrice()*getStandatrTax()*getArea();}
        else {
            if ((getArea()-NOT_TAX_AREA)>0)
            {return (getArea()-NOT_TAX_AREA)*getStandatrTax()*getPrice();}
            else {return 0;}
        }
    }
        return 0;
    }

    @Override
    public boolean checkBenefit() {
        return getOwner().getAge()>60 || getOwner().getAge()<18;
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
        return "Apartment {" +
                "Kn. (" + getCadastralNumber() + ")" +
                ", price-" + getPrice() +
                ", owner-" + getOwner() +
                ", area-" + getArea() + "rooms:" + roomNumber +
                '}';
    }


}
