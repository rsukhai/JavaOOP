package pract2;

public class main {
    public static void main(String[] args) {
        // 2.1.1
        int a = 10;
        int b = 2;
        System.out.println("Результат з ділення:" + a/b );
        // 2.1.2
        int number = 22;
        int digit1 = number / 10;  // Перша цифра
        int digit2 = number % 10;
        int sum = digit1 + digit2;
        System.out.println("Cумма цифр:" + sum );
        // 2.1.3
        double number2 = 5.3;
        double d = (number2 * 10);
        if (d%10 > 5){
            int f = (int)number2 +1;
            System.out.println(f);
        }
        else{
            System.out.println((int)d/10);
        }


    }
}
