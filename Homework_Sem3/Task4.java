//Задача 4*. Среднее значение массива
//        Напишите метод, который принимает массив целых чисел и возвращает
//        среднее значение элементов массива, округленное до ближайшего целого
//        числа.
//        Пример:
//        [4, 2, 7, 5, 1]
//        Результат:
//        4

package Homework_Sem3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(calculateTheAverageValue());
    }

    private static int calculateTheAverageValue() {
        ArrayList<Integer> array = addNumbersInArray();
        int average = 0;
        for (int i = 0; i < array.size(); i++) {
            average += array.get(i);
        }
        return average / array.size();
    }

    private static ArrayList<Integer> addNumbersInArray() {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer to create an array: ");
        while (true) {
            if (scan.hasNextInt()) {
                int i = scan.nextInt();
                if (i == 0) return array;
                array.add(i);
                System.out.println("Enter the next integer or press 0 to create an array: ");
            }
            else {
                String exit = scan.nextLine();
                if(exit.equals("q")) return array;
                System.out.println("Error! Enter the data is not a integer!" + "\n" +
                        "Reepeat enter the integer: ");
                scan.next();
            }
        }
    }
}
