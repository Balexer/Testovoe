package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        int number = 0;

        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);

        try {
            number = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели некоректные данные \nОстановка программы");
            System.exit(1);
        }

        if (number > 7) {
            System.out.println("Привет");
        } else {System.out.println("Число меньше либо равно 7");}
    }
}
