package minniahmetov.ilnaz.lesson2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, result;
        System.out.print("Введите количество секунд: ");
        first = num.nextFloat();
        result = first / 3600;
        System.out.print("Результат в часах - " + result);
    }
}