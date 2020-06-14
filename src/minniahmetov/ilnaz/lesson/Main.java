import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            System.out.println("Выберите программу:\n" +
                "1 - Бензин\n" +
                "2 - НДФЛ\n" +
                "3 - Секунда в часы\n");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        switch (type) {
            case 1: {
                System.out.println("Введите количество литров");
                double litrs = scanner.nextDouble();
                double price = 43;
                System.out.println(litrs * price);
            }
            break;
            case 2: {
                System.out.println("Введите зарплату");
                double salary = scanner.nextDouble();
                double tax = 0.87;
                System.out.println(salary * tax);

            }
            break;
            case 3: {
                System.out.println("Введите количество секунд");
                double user = scanner.nextDouble();
                int seconds = 3600;
                System.out.println(user / seconds);

            }
            break;
            default: {
                System.out.println("Вы ввели не корректное значение");
            }
            scanner.close();
        }
    }
}
