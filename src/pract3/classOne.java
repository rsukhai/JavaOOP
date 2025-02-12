package pract3;

public class classOne {
   int a;
   int b;
   int c;

    public classOne(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void multiply() {
        int result = a*b*c;
        System.out.println(result);
    }

    public int add(){
        return a+b+c;
    }

    public void printClass(classTwo two) {
        System.out.println("A from ClassTwo is: " + two.showA());
    }
}
