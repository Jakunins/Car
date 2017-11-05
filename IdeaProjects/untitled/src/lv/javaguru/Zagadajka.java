package lv.javaguru;

import java.util.*;

public class Zagadajka {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадайте ваше число от 0 до 10000");
        System.out.println("Компьютер отгадывает ваше число ");

        int x = 0;
        int y = 10000;

        while (y - x > 1) {
            System.out.println("Ваше число меньше?" + " " + (x+y)/2 );
            System.out.println("Если ДА - то нажмите 1, если НЕТ - то нажмите 2");
            int b = scanner.nextInt();
            switch (b)
            {
                case 1:
                    y = y - (y-x)/2;
                    break;
                case 2:
                    x = x + (y-x)/2;
                    break;
            }
        }
        System.out.println("Компьютер отгадал: ваше число " + (x+y)/2);
    }
}