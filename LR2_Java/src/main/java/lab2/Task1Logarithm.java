package lab2;

public class Task1Logarithm {

    public static void run() {
        double x = ConsoleInput.readDouble("Введіть x: ");

        if (x > 1) {
            double y = Math.log(x);
            System.out.println("y = ln(x) = " + y);
        } else {
            System.out.println("Помилка: x повинен бути більшим за 1.");
        }
    }
}