package lv.javaguru;
import java.util.*;

public class UGADAJKA {
    public static void main (String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);
        System.out.println("Компьютер загадал число");
        System.out.println("Отгадайте - введите ваше число");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        while (a!=b) {
            if (a<b) {
                System.out.println("Меньше - Ваше число меньше ");
                b = scanner.nextInt();
            }
            if (a>b) {
                System.out.println("Больше - Ваше число больше ");
                b = scanner.nextInt();
            }
        }
        System.out.println("Вы угадали");
    }

}
