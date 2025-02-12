package pract3;

public class classThree {
    double a;
    double b;
    double c;

    public classThree(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void showC(){
        System.out.println("C in classThree is:"+ c);
    }

    public double division(){
        return a/b;
    }

}
