package pract3;

class Whiskey extends Alcohol {
    private String region;

    Whiskey(String name, int capacity, String PSU, String type, String region) {
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
        System.out.println("This is a Whiskey, real man drink.");
    }
}
