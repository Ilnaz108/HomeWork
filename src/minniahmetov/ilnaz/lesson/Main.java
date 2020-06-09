package minniahmetov.ilnaz.lesson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GasolineCalc gasolineCalc = new GasolineCalc();
        NdflCacl ndflCacl = new NdflCacl();
        SecToHoursCalc secToHoursCalc = new SecToHoursCalc();
        System.out.println("Выберите программу:\n" +
                "1 - НДФЛ\n" +
                "2 - Бензин\n" +
                "3 - Секунда в часы\n");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        switch (type) {
            case 1: {
                System.out.println("Введите количество литров");
                int litrs = scanner.nextInt();
                gasolineCalc.calc(litrs);
            }
            break;
            case 2: {
                System.out.println("Введите зарплату");
                int salary = scanner.nextInt();
                ndflCacl.calc(salary);
            }
            break;
            case 3: {
                System.out.println("Введите количество секунд");
                int sec = scanner.nextInt();
                secToHoursCalc.calc(sec);
            }
            break;
            default: {
                System.out.println("Вы ввели не корректное значение");
            }
            scanner.close();
        }
    }
}
