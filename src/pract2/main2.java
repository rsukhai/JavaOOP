package pract2;

public class main2 {
    public static void main(String[] args) {
        //2.2.1
        int n = 60;
        if (n > 25 && n < 100) {
            System.out.println("Число " + n + " міститься в проміжку (25,100)");
        } else {
            System.out.println("Число " + n + " не міститься в проміжку (25,100)");
        }
        //2.2.2
        int x = 765;
        int third = x % 10;
        int second = (x / 10) % 10;
        int first = x / 100;
        if (third > second && third > first) {
            System.out.println("Найбільше число:" + third);
        } else if (second > third && second > first) {
            System.out.println("Найбільше число:" + second);
        } else {
            System.out.println("Найбільше число:" + first);
        }
        //2.2.3
        int currentFloor = 1;
        if (currentFloor < 1 || currentFloor > 9) {
            System.out.println("Помилка! Поверх має бути в межах 1-9.");
        } else {
            int targetFloor = 2;
            if (targetFloor < 1 || targetFloor > 9) {
                System.out.println("Помилка! Поверх має бути в межах 1-9.");
            } else if (targetFloor == currentFloor) {
                System.out.println("Ви вже на цьому поверсі.");
            } else {
                if (targetFloor == 2) {
                    if (currentFloor == 1) {
                        targetFloor = 3; // Підйом на 3-й поверх
                        System.out.println("Кнопка 2-го поверху не працює! Вас доставлено на 3 поверх.");
                    } else {
                        targetFloor = 1; // Спуск на 1-й поверх
                        System.out.println("Кнопка 2-го поверху не працює! Вас доставлено на 1 поверх.");
                    }
                } else {
                    if (targetFloor > currentFloor) {
                        System.out.println("Ви піднялись на " + targetFloor + " поверх.");
                    } else {
                        System.out.println("Ви спустились на " + targetFloor + " поверх.");
                    }
                }

            }
        }
        //2.2.4
        String choice = "-";

        // Обробка вибору через switch
        switch (choice) {
            case "Так", "ОК", "Yes", "Y", "+", "Ok" ->
                    System.out.println("Я погоджуюсь!");

            case "Ні", "NO", "N", "-", "No" ->
                    System.out.println("Я відмовляюсь!");

            default ->
                    System.out.println("Невірний вибір! Будь ласка, введіть коректне значення.");
        }



    }
}
