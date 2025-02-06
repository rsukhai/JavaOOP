package pract2;

public class main3 {
    public static void main(String[] args) {
    //2.3.1
        for ( int i = 500; i <= 650; i=i+10){
            System.out.println(i);
        }
    //2.3.2
        for (int a = 2; a<5000;  a=(2*a)-1){
            System.out.println(a);
        }
    //2.3.3
        int number = 10;

        System.out.println("Додатні дільники числа 10:");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    //2.3.4
        int factorialFor = 1;
        for (int i = 1; i <= number; i++) {
            factorialFor *= i;
        }
        System.out.println("Факторіал " + number + " (for): " + factorialFor);

        int factorialWhile = 1;
        int i = 1;
        while (i <= number) {
            factorialWhile *= i;
            i++;
        }
        System.out.println("Факторіал " + number + " (while): " + factorialWhile);

    //2.3.5
        int counter = 0;
        for(int hour = 0; hour <24; hour++){
            for (int minutes = 0; minutes<=59; minutes++){
                int fHour = hour / 10;   // Перша цифра години
                int sHour = hour % 10;  // Друга цифра години
                int fMin = minutes / 10; // Перша цифра хвилин
                int sMin = minutes % 10; // Друга цифра хвилин
                // Перевіряємо симетричність (дзеркальне відображення)
                if (fHour == sMin && sHour == fMin) {
                    counter++;
                }

            }
        }
        System.out.println("Кількість симетричних комбінацій: " + counter);


    }
}

