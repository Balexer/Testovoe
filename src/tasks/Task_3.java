package tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        try {
        System.out.println("Укажите размер массива целым числом");
        Scanner scanSize = new Scanner(System.in);
        int[] array = new int [scanSize.nextInt()];
        Scanner scan = new Scanner(System.in);
        System.out.println("Заполните массив");
        for (int i=0;i<array.length;i++) {
            array[i] = scan.nextInt();
        }
            System.out.println("Полученный массив");
        for (int i = 0; i < array.length; i++) {
            if(array[i]%3 == 0) {
                System.out.println(array[i]);
            }
        }}  catch (InputMismatchException e) {
            System.out.println("Вы ввели некоректные данные \nОстановка программы");
            System.exit(1);
        }
    }
}
