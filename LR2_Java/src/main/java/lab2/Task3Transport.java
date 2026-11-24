package lab2;

public class Task3Transport {

    public static void run() {
        int code = ConsoleInput.readInt(
                "Введіть код транспорту (1-3): "
        );

        switch (code) {
            case 1:
                System.out.println("Транспорт: автомобіль");
                break;

            case 2:
                System.out.println("Транспорт: автобус");
                break;

            case 3:
                System.out.println("Транспорт: велосипед");
                break;

            default:
                System.out.println("Невідомий код транспорту.");
        }
    }
}