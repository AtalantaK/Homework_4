import java.util.Scanner;

public class Homework_4_Conditions {
    public static void main(String[] args) {
        // Task 1
        System.out.print("Введите целое число: ");
        Scanner scanner = new Scanner(System.in);
        int balance = scanner.nextInt();
        if (balance == 10) System.out.println("Десятка");

        // Task 2
        System.out.print("Введите целое число: ");
        scanner = new Scanner(System.in);
        int task2 = scanner.nextInt();
        if (task2 % 2 == 0) System.out.println("Четное число");
        else System.out.println("Нечетное число");

        // Task 3
        System.out.print("Введите целое число: ");
        scanner = new Scanner(System.in);
        int task3 = scanner.nextInt();
        if (task3 % 4 == 0) System.out.println("Четное число. Кратно четырем");
        else if (task3 % 2 == 0) System.out.println("Четное число");
        else if (task3 % 3 == 0) System.out.println("Нечетное число. Кратно трем");
        else System.out.println("Нечетное число");

        // Task 4
        System.out.print("Введите пароль: ");
        scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isPasswordCorrect = true;

        if (password.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
            isPasswordCorrect = false;
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
            isPasswordCorrect = false;
        }
        if (!password.matches(".*[!@#$%^].*")) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
            isPasswordCorrect = false;
        }
        if (isPasswordCorrect) System.out.println("Пароль принят");

        // Task 5
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Bizz");
            else System.out.println(i);
        }
    }
}
