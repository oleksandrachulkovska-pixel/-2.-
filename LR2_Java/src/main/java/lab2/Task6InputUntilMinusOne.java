package lab2;

public class Task6InputUntilMinusOne {

    public static void run() {
        System.out.println("Введіть числа.");
        System.out.println("Для завершення введіть -1.");
        System.out.println("Нулі будуть пропущені.");

        while (true) {
            int number = ConsoleInput.readInt("Число: ");

            if (number == -1) {
                break;
            }

            if (number == 0) {
                continue;
            }

            System.out.println("Введене число: " + number);
        }

        System.out.println("Введення завершено.");
    }
}