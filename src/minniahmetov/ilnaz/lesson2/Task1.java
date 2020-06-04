package minniahmetov.ilnaz.lesson2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first, result;
        System.out.print("Введите количество литров: ");
        first = num.nextFloat();
        result = first * 43;
        System.out.print("Сумма к оплате " + result);
    }
}
