package lv.javaguru;
import java.util.*;

public class ZAGADAJKA {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадайте ваше число от 0 до 10000");
        int a = scanner.nextInt();

        System.out.println("Компьютер отгадывает ваше число - подождите:");

        int x = 0;
        int y = 10000;

        while ((x+y)/2 != a) {
            if ((x+y)/2 > a) {
                y = y - (y-x)/2;
                System.out.print("Число лежит между ");
                System.out.printf("x=%d; y=%d \n", x, y);
            }
            if ((x+y)/2 < a) {
                x = x + (y-x)/2;
                System.out.print("Число лежит между ");
                System.out.printf("x=%d; y=%d \n", x, y);
            }
        }
        System.out.println("Компьютер отгадал: ваше число " + (x+y)/2);
    }
}
