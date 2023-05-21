import java.util.*;

public class Main {
    public static void main(String[] args) {
/*        1
        В ходе разговора с заказчиком было выяснено, что он хочет построить модель города
        для своей компании по кадастровым расчетам, связанным с землепользованием.
        Заказчик сказал, что существуют всего несколько типов недвижимости (RealProperty):

        земельный участок (Land),
                лесной массив(Forest),
                дом(House),
                квартира(Apartment),
                гараж(Garage) и т.д.
                Любой из этих объектов имеет атрибуты:
        кадастровый номер (cadastralNumber),
                стоимость(double price),
        собственника(Person owner)
        площадь (double area).

        Земля имеет такой атрибут как назначение (String purpose):

        земли сельскохозяйственного назначения;
        земли населенных пунктов;
        земли промышленности;


        Лесной массив обладает свойством: -boolean isProtectedZone - является природоохранной зоной или нет.

        House - обладает полями:

        ArrayList - жильцы,
                количество этажей
        Квартира - обладает полями:

        ArrayList - жильцы,
                количество комнат.
                Гараж обладает полями:

        количество машиномест.



        Релиз 1
        Подумайте о том как сделать модель для данных объектов, понадобятся ли вам
        абстрактные классы или интерфейсы? Сделайте модель из классов,
        пропишите отношения наследования. Можете сделать это на бумаге или в графическом редакторе.

        Релиз 2
        Нужно создать метод, который бы рассчитывал налог на имущество.
        В общем случае налог на имущество рассчитывается в размере 0.1 % рыночной стоимости.
        (меньше одного процента). Вы можете уточнить налог, в зависимости от класса, используя Override.

        Релиз 3
        Создайте массив объектов - и отсортируйте его:

        сначала по общей стоимости
        по сумме налога
        по площади
        по адресу (в алфавитном порядка) Дополнительно можете вынести сортировки
        в отдельные методы, например, getSortedByPriceList(ArrayList) ...
        Релиз 4
        Подойдите творчески к заданию. Добавьте функционал на ваше усмотрение.

 */
        // Релиз 2
        //Apartments

        Apartment apartment1 = new Apartment("1234", 80000, new Person("Anna", "OwnerA", 64), 74, 3, new ArrayList<>(List.of(new Person("Anna", "OwnerA", 64))));
        Apartment apartment2 = new Apartment("1235", 50000, new Person("Natalia", "OwnerN", 25), 52, 2, new ArrayList<>(List.of(new Person("Olha", "Petrova", 40))));
        Apartment apartment3 = new Apartment("1236", 45000, new Person("Elena", "OwnerE", 35), 45, 1, new ArrayList<>(List.of(new Person("Petr", "Sitizen", 34))));
        Apartment apartment4 = new Apartment("1237", 90000, new Person("Ivan", "OwnerI", 35), 80, 4,
                new ArrayList<>(List.of(
                        new Person("Amina", "Klein", 4),
                        new Person("Ivan", "OwnerI", 35))));
        Apartment apartment5 = new Apartment("1238", 35000, new Person("Oleksandr", "OwnerO", 28), 42, 1, new ArrayList<>(List.of(new Person("Oleksandr", "OwnerO", 28))));

        double tax1 = apartment1.calculatePropertyTax();  /// 1 = 0; 2 = 2600; 3 = 2025; 4 = 1800; 5 = 0
        System.out.println(tax1);
        double tax2 = apartment2.calculatePropertyTax();  /// 1 = 0; 2 = 2600; 3 = 2025; 4 = 1800; 5 = 0
        System.out.println(tax2);
        double tax3 = apartment3.calculatePropertyTax();  /// 1 = 0; 2 = 2600; 3 = 2025; 4 = 1800; 5 = 0
        System.out.println(tax3);
        double tax4 = apartment4.calculatePropertyTax();  /// 1 = 0; 2 = 2600; 3 = 2025; 4 = 1800; 5 = 0
        System.out.println(tax4);
        double tax5 = apartment5.calculatePropertyTax();  /// 1 = 0; 2 = 2600; 3 = 2025; 4 = 1800; 5 = 0
        System.out.println(tax5);
// Релиз 2
//FORESTS

        Forest forest1 = new Forest("9876", 4500000, new Person("Oleg", "Kotov", 56), 1000000, true);
        Forest forest2 = new Forest("9875", 8000000, new Person("Ivan", "Ivanov", 45), 2000000, false);
        double taxForest1 = forest1.calculatePropertyTax();//14500
        System.out.println(taxForest1);
        double taxForest2 = forest2.calculatePropertyTax();//8000
        System.out.println(taxForest2);

        // Релиз 2
//Garages

        Garage garage1 = new Garage("5678", 1000, new Person("Anatoliy", "Zablochnik", 62), 8, 2);
        Garage garage2 = new Garage("5677", 3000, new Person("Oksana", "Oblako", 40), 25, 8);
        double taxGarage1 = garage1.calculatePropertyTax(); //0
        System.out.println(taxGarage1);
        double taxGarage2 = garage2.calculatePropertyTax();//3
        System.out.println(taxGarage2);

        // Релиз 3
//Houses
        ArrayList<Person> houseLiving1 = new ArrayList<>();
        houseLiving1.add(new Person("Anna", "OwnerA", 35));
        houseLiving1.add(new Person("Amina", "OwnerA", 3));
        Person ownerHouse1 = new Person("Anna", "OwnerA", 35);


        ArrayList<Person> houseLiving2 = new ArrayList<>();
        houseLiving1.add(new Person("Olha", "Belyk", 65));
        houseLiving1.add(new Person("Slava", "Belyk", 63));
        Person ownerHouse2 = new Person("Anna", "OwnerA", 35);

        House house1 = new House("4567", 6000000, ownerHouse1, 500, 5, houseLiving1);
        House house2 = new House("4566", 1000000, ownerHouse2, 200, 2, houseLiving2);
        System.out.println(house1.calculatePropertyTax()); // 1200000.0
        System.out.println(house2.calculatePropertyTax());///200000.0

        // Релиз 3
//Lands

        Person ownerLand1 = new Person("Svetlsns", "OwnerS", 50);
        Person ownerLand2 = new Person("Oleksandr", "OwnerO", 25);
        Person ownerLand3 = new Person("Alla", "OwnerA", 76);

        Land land1 = new Land("7896", 567000000, ownerLand1, 10000000, Purpose.AGRICULTURALLAND);
        Land land2 = new Land("7894", 767000000, ownerLand2, 50000000, Purpose.INDUSTRIALLAND);
        Land land3 = new Land("7893", 167000000, ownerLand3, 30000000, Purpose.SETTLEMENTSLAND);

        System.out.println(land1.calculatePropertyTax()); // 283500
        System.out.println(land2.calculatePropertyTax()); // 7670000
        System.out.println(land3.calculatePropertyTax()); // 167000


//        Релиз 3

        ArrayList<RealProperty> realProperties = new ArrayList<>();
        realProperties.add(apartment1);
        realProperties.add(apartment2);
        realProperties.add(apartment3);
        realProperties.add(apartment4);
        realProperties.add(apartment5);
        realProperties.add(forest1);
        realProperties.add(forest2);
        realProperties.add(garage1);
        realProperties.add(garage2);
        realProperties.add(house1);
        realProperties.add(house2);
        realProperties.add(land1);
        realProperties.add(land2);
        realProperties.add(land3);
        print(realProperties);

//     сортируeм по общей стоимости

        System.out.println("---------- сортируeм по общей стоимости  ---------");
        print(getSortRealPropertyByPrice(realProperties));

        System.out.println("---------- сортируeм по сумме налога  ---------");
        print(getSortRealPropertyByTax(realProperties));

        System.out.println("---------- сортируeм по площади  ---------");
        print(getSortRealPropertyByArea(realProperties));


        System.out.println("---------- сортируeм по кадастр. номеру  ---------");
        print(getSortRealPropertyByCadNumber(realProperties));

        //        Релиз 4

        System.out.println("---------- Map with Tax  ---------");
        printMap(createMapRealPropertyTax(realProperties));


    }


    public static ArrayList<RealProperty> getSortRealPropertyByArea(ArrayList<RealProperty> realProperties) {
        realProperties.sort(new ComparatorRealPropertyByArea());
        return realProperties;
    }

    public static ArrayList<RealProperty> getSortRealPropertyByCadNumber(ArrayList<RealProperty> realProperties) {
        realProperties.sort(new ComparatorRealPropertyByCadNumber());
        return realProperties;
    }

    public static ArrayList<RealProperty> getSortRealPropertyByPrice(ArrayList<RealProperty> realProperties) {
        realProperties.sort(new ComparatorRealPropertyByPrice());
        return realProperties;
    }

    public static ArrayList<RealProperty> getSortRealPropertyByTax(ArrayList<RealProperty> realProperties) {
        realProperties.sort(new ComparatorRealPropertyByTax());
        return realProperties;
    }


    public static Map<String, Double> createMapRealPropertyTax(ArrayList<RealProperty> realProperties) {
        Map<String, Double> realPropertyTax = new HashMap<>();
        for (RealProperty realProperty : realProperties
        ) {
            realPropertyTax.put(realProperty.getCadastralNumber(), realProperty.calculatePropertyTax());
        }
        return realPropertyTax;
    }


    public static void print(ArrayList<RealProperty> list) {
        for (RealProperty realProperty : list
        ) {
            System.out.println(realProperty);

        }
    }

    public static void printMap(Map<String, Double> map) {
        for (Map.Entry entry : map.entrySet()
        ) {
            System.out.println(entry.getKey() + " Tax per year: " + entry.getValue());

        }
    }
}




