package minniahmetov.ilnaz.lesson2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        float first;
        double result;
        System.out.print("Введите заработную плату до вычета: ");
        first = num.nextFloat();
        result = first* 0.87;
        System.out.print("Результат - " + result);
    }
}