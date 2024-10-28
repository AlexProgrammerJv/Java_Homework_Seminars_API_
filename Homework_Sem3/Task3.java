//Задача 3. Длина слов
//        Реализуйте метод, который принимает на вход массив строк и возвращает
//        новый массив, содержащий только строки, длина которых больше 3 символов.
//        Пример:
//        ["cat", "elephant", "dog", "giraffe"]
//Результат:
//        ["elephant", "giraffe"]


package Homework_Sem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder sort = sortedLines(addLinesInArray());
        String[] sortArr = transformationSbInArr(sort);
        System.out.println(Arrays.toString(sortArr));
    }

    private static String[] transformationSbInArr(StringBuilder sort) {
        return sort.toString().split(",");
    }

    private static StringBuilder sortedLines(ArrayList<String> list) {
        System.out.println(list);
        StringBuilder sort = new StringBuilder();
        for (String s : list) {
            if (s.length() > 3) {
                if (sort.length() > 1) sort.append(",");
                sort.append(s);
            }
        }
        return sort;
    }

    private static ArrayList<String> addLinesInArray() {
        ArrayList<String> array = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the line to create an array: ");
        while (true) {
            if (!scan.hasNextInt()) {
                System.out.println("Enter the next line or press 0 to create an array: ");
                String i = scan.nextLine();
                if (i.equals("q")) return array;
                array.add(i);
            } else {
                System.out.println("Error! Enter the data is not a line!" + "\n" +
                        "Reepeat enter the line: ");
                scan.next();
            }
        }
    }
}
