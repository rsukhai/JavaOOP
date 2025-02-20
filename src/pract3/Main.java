package pract3;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage("Silpo",1000,"Lviv");
        Water morshynska = new Water(700,"Morshynska","Morshyn");
        Alcohol alcohol = new Alcohol();
        Wine moet = new Wine("moet",750,"8%","wine","france");
        Beer ell = new Beer("ell",500,"8%","beer",5);
        Whiskey jameson = new Whiskey("jameson",500,"42%","whiskey","USA");
//        storage.printInfo();
//        System.out.println(storage.showAdress());
//        storage.printNameProduct(morshynska);
//        System.out.println("----------------------");
//
//        morshynska.printInfo();
//        System.out.println(morshynska.mlToOZ());
//        System.out.println("----------------------");
//
//        jameson.printInfo();
//        System.out.println(jameson.PSU());
        System.out.println(moet.getRegion());
        System.out.println(alcohol.PSU(5));
        System.out.println(alcohol.PSU("5"));




        alcohol.describe();
        moet.describe();
        ell.describe();
        jameson.describe();


        alcohol.compareAlcoholContent(moet,ell);






    }
}
