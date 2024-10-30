package Homework_Sem4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Tsk5 {
    public static void main(String[] args) {
        String line = countedString();
        Deque<String> list = countOccurrences(addLinesInArray(), line);
        System.out.println(list);

    }

    private static Deque<String> countOccurrences(Deque<String> list, String line) {
        System.out.println(list);
        list.removeIf(element -> element.equals(line));
        return list;
    }


        private static String countedString() {

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

        private static Deque<String> addLinesInArray() {
            Deque<String> array = new LinkedList<>();
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
