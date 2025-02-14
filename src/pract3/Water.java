package pract3;

public class Water {
    double capacity;
    String name;
    String producer;

    public Water(double capacity, String name, String producer) {
        this.capacity = capacity;
        this.name = name;
        this.producer = producer;
    }

    public void printInfo(){
        System.out.println("Name of product: "+name+", product capacity in ml: "+capacity+", producer name: "+producer);
    }

    public double mlToOZ(){
        return capacity*0.03;
    }

}
