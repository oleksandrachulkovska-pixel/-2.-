package lab2;

public class Task4Sign {

    public static void run() {
        double number;

        do {
            number = ConsoleInput.readDouble("Введіть ненульове число: ");

            if (number == 0) {
                System.out.println("Число не повинно дорівнювати нулю.");
            }

        } while (number == 0);

        String result = (number > 0) ? "позитивне" : "негативне";

        System.out.println("Число " + result + ".");
    }
}