package pract3;

public class Storage {
    String name;
    int size;
    String adress;

    public Storage(String name, int size, String adress) {
        this.name = name;
        this.size = size;
        this.adress = adress;
    }

    public void printInfo() {
        System.out.println("Name of storage: "+name+", size: "+size+", storage adress: "+adress);
    }

    public String showAdress(){
        return adress;
    }

    public void printNameProduct(Water water) {
        System.out.println("Name of this water is: " + water.name);
    }
}
