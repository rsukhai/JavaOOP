package pract3;

public class Main {
    public static void main(String[] args) {
        classOne one = new classOne(2,2,2);
        classTwo two = new classTwo(1,2,3);
        classThree three = new classThree(10,2,5);

        one.multiply();
        System.out.println(one.add());
        one.printClass(two);
        System.out.println("-----------------------");

        two.minus();
        System.out.println(two.showA());
        System.out.println("-----------------------");

        System.out.println(three.division());
        three.showC();




    }
}
