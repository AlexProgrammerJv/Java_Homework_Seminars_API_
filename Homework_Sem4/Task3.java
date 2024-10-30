//Задача 3. Количество вхождений слова
//Реализуйте метод countOccurrences в классе ListUtils, который
//принимает LinkedList<String> и строку, и возвращает количество
//вхождений строки в список.

package Homework_Sem4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<String> list = addLinesInArray();
        System.out.println(list);
        String line = countedString();
        int count = countOccurrences(list, line);
        System.out.println(count);
    }

    private static int countOccurrences(LinkedList<String> list, String line)
    {
        int count = 0;
        for (String s : list) {
            if (s.equals(line)) count++;
        }
        return count;
    }
    private static String countedString(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the line: ");
        while (true) {
            if (!scan.hasNextInt()) {
                String line = scan.nextLine();
                return line;
            } else {
                System.out.println("Error! Enter the object is not a line!" + "\n" +
                        "Reepeat enter the line: ");
                scan.next();
            }
        }
    }

    private static LinkedList<String> addLinesInArray() {
        LinkedList<String> array = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the line to create an array: ");
        while (true) {
            if (!scan.hasNextInt()) {
                String i = scan.nextLine();
                if (i.equals("/")) return array;
                array.add(i);
                System.out.println("Enter the next line or press 0 to create an array: ");
            } else {
                System.out.println("Error! Enter the data is not a line!" + "\n" +
                        "Reepeat enter the line: ");
                scan.next();
            }
        }
    }

}
