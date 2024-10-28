//Задание 1. Удаление отрицательных значений из массива
//        Реализуйте метод, который принимает на вход целочисленный массив и
//удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
//только неотрицательные числа.
//        Пример:
//        [-1, 2, -3, 4, -5, 6]
//Результат:
//        [2, 4, 6]

package Homework_Sem3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the minRange in the Array");
        int minRange = enterData();
        System.out.println("Enter the maxRange in the Array");
        int maxRange = enterData();
        System.out.println("Enter the length the Array");
        int length = enterData();
        int[] array = generateArray(minRange, maxRange, length);
        System.out.println(Arrays.toString(deleteNegativeNumbersInArray(array)));

    }


    public static int[] generateArray(int minRange, int maxRange, int length) {
        int[] random = new int[length];
        Random rnd = new Random();

        for (int i = 0; i < random.length; i++) {
            random[i] = rnd.nextInt(minRange, maxRange - 1);
        }
        System.out.print(Arrays.toString(random) + "\n");
        return random;
    }

    private static int countNegativeElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) count++;
        }
        return array.length - count;
    }

    public static int[] deleteNegativeNumbersInArray(int[] array) {

        int[] positiveArr = new int[countNegativeElements(array)];
        int j = 0;
        for (int i : array) {
            if (i > 0) {
                positiveArr[j] = i;
                j++;
            }
        }
        return positiveArr;
    }

    private static int enterData() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            System.out.println("Error! Enter data is not a number! \n " +
                    "Reepeat enter the integer:");
            scan.next();
        }
        int numb = scan.nextInt();
        return numb;
    }

}
