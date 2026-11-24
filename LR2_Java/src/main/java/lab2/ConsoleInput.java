package lab2;

import java.util.Scanner;

public class ConsoleInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }

            System.out.println("Помилка! Введіть ціле число.");
            scanner.next();
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.print(message);

            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();

                if (Double.isFinite(value)) {
                    return value;
                }

                System.out.println("Помилка! Число повинно бути скінченним.");
            } else {
                System.out.println("Помилка! Введіть число.");
                scanner.next();
            }
        }
    }
}