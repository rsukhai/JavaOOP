package pract3;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage("Silpo",1000,"Lviv");
        Water morshynska = new Water(700,"Morshynska","Morshyn");
        Alcohol jameson = new Alcohol("jameson",750,"42%");

        storage.printInfo();
        System.out.println(storage.showAdress());
        storage.printNameProduct(morshynska);
        System.out.println("----------------------");

        morshynska.printInfo();
        System.out.println(morshynska.mlToOZ());
        System.out.println("----------------------");

        jameson.printInfo();
        System.out.println(jameson.whatIsPSU());




    }
}
