package pract3;

class Wine extends Alcohol {
    private String region;

    Wine(String name, int capacity, String PSU, String type, String region) {
        super(name, capacity, PSU, type);
        this.region = region;
    }

    String getRegion() {
        return region;
    }

    void setRegion(String region) {
        this.region = region;
    }


    static void describe() {
        System.out.println("This is a Wine, usually made from grapes.");
    }
}
