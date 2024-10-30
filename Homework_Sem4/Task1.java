//Задание 1. Удаление нечетных строк
//Дан LinkedList с несколькими элементами. В методе
//removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
//которых нечетная. Используйте LinkedList и стандартные методы.


package Homework_Sem4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> oddLinesArr = removeOddLines(addLinesInArray());
        System.out.println(oddLinesArr);

    }

    public static LinkedList<String> removeOddLines(LinkedList<String> linkedList) {
        LinkedList<String> oddLinesArr = new LinkedList<>();
        System.out.println(linkedList);
        for (String s : linkedList) {
            if (s.length() % 2 == 0) oddLinesArr.add(s);
        }
        linkedList.removeAll(oddLinesArr);
        return oddLinesArr;
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
