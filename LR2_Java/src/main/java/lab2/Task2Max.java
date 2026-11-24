package lab2;

public class Task2Max {

    public static void run() {
        int a = ConsoleInput.readInt("Введіть перше число: ");
        int b = ConsoleInput.readInt("Введіть друге число: ");

        if (a > b) {
            System.out.println("Більше число: " + a);
        } else if (b > a) {
            System.out.println("Більше число: " + b);
        } else {
            System.out.println("Числа рівні.");
        }
    }
}