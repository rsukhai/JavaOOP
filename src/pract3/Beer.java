package pract3;

class Beer extends Alcohol {
    private double bitterness;

    Beer(String name, int capacity, String PSU, String type, double bitterness) {
        super(name, capacity, PSU, type);
        this.bitterness = bitterness;
    }

    public double getBitterness() {
        return bitterness;
    }

    public void setBitterness(double bitterness) {
        this.bitterness = bitterness;
    }
    static void describe() {
        System.out.println("This is a Beer, not Bear.");
    }
}
