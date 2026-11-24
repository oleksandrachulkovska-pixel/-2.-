package lab2;

public class Task5Multiplication {

    public static void run() {
        int n = ConsoleInput.readInt("Введіть число: ");

        System.out.println("Таблиця множення для " + n + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}