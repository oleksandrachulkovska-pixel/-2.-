package lab2;

import java.util.Scanner;
import java.util.Locale;

public class MainMenu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int choice = -1;

        do {
            System.out.println("\n========== ЛАБОРАТОРНА РОБОТА №2 ==========");
            System.out.println("Варіант 25");
            System.out.println("1. Обчислення ln(x)");
            System.out.println("2. Знайти більше з двох чисел");
            System.out.println("3. Визначення виду транспорту");
            System.out.println("4. Визначення знака числа");
            System.out.println("5. Таблиця множення");
            System.out.println("6. Введення чисел до -1");
            System.out.println("0. Вихід");
            System.out.println("============================================");

            System.out.print("Оберіть завдання: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Помилка! Введіть ціле число.");
                scanner.next();
                continue;
            }

            if (choice < 0 || choice > 6) {
                System.out.println("Невірний пункт меню!");
                continue;
            }

            switch (choice) {
                case 1:
                    Task1Logarithm.run();
                    break;

                case 2:
                    Task2Max.run();
                    break;

                case 3:
                    Task3Transport.run();
                    break;

                case 4:
                    Task4Sign.run();
                    break;

                case 5:
                    Task5Multiplication.run();
                    break;

                case 6:
                    Task6InputUntilMinusOne.run();
                    break;

                case 0:
                    System.out.println("Програму завершено.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}