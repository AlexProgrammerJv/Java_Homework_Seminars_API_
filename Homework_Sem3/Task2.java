//Задача 2. Уникальные числа
//        Напишите метод, который принимает целочисленный массив и возвращает
//        новый массив, содержащий только уникальные элементы из исходного
//        массива.
//        Пример:
//        [1, 2, 2, 3, 4, 4, 5]
//        Результат:
//        [1, 2, 3, 4, 5]

package Homework_Sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = saveExclusiveElement(addNumbersInArray());
        int[] arr = transformationListInArray(array);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] transformationListInArray(ArrayList<Integer> list) {
        int[] transformationArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) transformationArr[i] = list.get(i);
        return transformationArr;
    }


    private static ArrayList<Integer> saveExclusiveElement(ArrayList<Integer> array) {
        ArrayList<Integer> exclusiveArray = new ArrayList<>();

        for (Integer i : array) {
            int count = 0;
            for (Integer j : array) {
                if (j.equals(i)) {
                    count++;
                    if (count > 1 & !exclusiveArray.contains(i)) {
                        exclusiveArray.add(i);
                    }
                }
            }
        }
        return exclusiveArray;
    }

    private static ArrayList<Integer> addNumbersInArray() {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer to create an array: ");
        while (true) {
            if (!scan.hasNextInt()) {
                System.out.println("Error! Enter the data is not a integer!" + "\n" +
                        "Reepeat enter the integer: ");
                scan.next();
                String exit = scan.toString();
                exit = "q";
                if(exit.equals("q")) return array;
            } else {
                int i = scan.nextInt();
                if (i == 0) return array;
                array.add(i);
                System.out.println("Enter the next integer or press 0 to create an array: ");
            }
        }
    }
}



