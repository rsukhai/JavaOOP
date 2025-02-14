package pract3;

public class Alcohol {
    String name;
    double capacity;
    String PSU;

    public Alcohol(String name, double capacity, String PSU) {
        this.name = name;
        this.capacity = capacity;
        this.PSU = PSU;
    }

    public void printInfo(){
        System.out.println("Name of product: "+name+", product capacity in ml: "+capacity+", PSU : "+PSU);
    }

    public String whatIsPSU(){
        return "Psu is нow much clean alcohol is in this bottle for 100 ml";
    }


}
