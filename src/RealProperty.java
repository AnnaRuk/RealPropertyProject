public abstract class RealProperty implements Taskpayable{

   private String cadastralNumber; //кадастровый номер
   private double price;
   private Person owner; ///собственник
    private double area; //площадь

    private static double STANDATR_TAX = 0.001;

    public RealProperty(String cadastralNumber, double price, Person owner, double area) {
        this.cadastralNumber = cadastralNumber;
        this.price = price;
        this.owner = owner;
        this.area = area;
    }

    @Override
    public abstract String toString();

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    public double getArea() {
        return area;
    }

    public static double getStandatrTax() {
        return STANDATR_TAX;
    }

    //TODO
    public double calculatePropertyTax (){
        System.out.println("please check a tax system!");
        return price*STANDATR_TAX;
    }
     public boolean checkBenefit(){
        return false;
    }

    public boolean foRent(){
        return true;
    }
}



