package pract3;

class Alcohol {
    private String name;
    private int capacity;
    private String PSU;
    private String type;

    // Конструктори
    Alcohol() {
        this.name = "alcohol";
        this.capacity = 0;
        this.PSU = "none";
        this.type = "none";
    }
    Alcohol(String name, int capacity, String PSU, String type) {
        this.name = name;
        this.capacity = capacity;
        this.PSU = PSU;
        this.type = type;
    }

    Alcohol(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.PSU = "0";
        this.type = "unknown";
    }
    Alcohol(String name){
        this.name = name;
        this.capacity = 0;
        this.PSU = "none";
        this.type = "none";
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getCapacity() {
        return capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    String getPSU() {
        return PSU;
    }

    void setPSU(String PSU) {
        this.PSU = PSU;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Capacity: " + capacity + "ml, PSU: " + PSU + ", Type: " + type);
    }


    String PSU() {
        return "PSU: How much clean alcohol is in this bottle for 100 ml";
    }

    String PSU(int percentage) {
        return "PSU: " + percentage + "% alcohol content.";
    }

    String PSU(String percentage) {
        return "PSU: " + percentage + "% alcohol content (String).";
    }

     static void describe() {
        System.out.println("This is an Alcoholic drink.");
    }

    void compareAlcoholContent(Wine wine, Beer beer) {
        double winePSU = Double.parseDouble(wine.getPSU().replace("%", ""));
        double beerPSU = Double.parseDouble(beer.getPSU().replace("%", ""));

        System.out.println("Comparing alcohol content:");
        System.out.println(wine.getName() + " has " + winePSU + "% alcohol.");
        System.out.println(beer.getName() + " has " + beerPSU + "% alcohol.");

        if (winePSU > beerPSU) {
            System.out.println(wine.getName() + " has more alcohol than " + beer.getName());
        } else if (winePSU < beerPSU) {
            System.out.println(beer.getName() + " has more alcohol than " + wine.getName());
        } else {
            System.out.println("Both have the same alcohol content.");
        }
    }
}



