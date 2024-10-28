package Homework_Sem3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(calculateTheAverageValue());
    }


    private static int calculateTheAverageValue() {
        int average = 0;
        for (Integer i : addNumbersInArray()) {
            average += i;
        }
        average = average / addNumbersInArray().size();
        return average;
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
                if (exit.equals("q")) return array;
            } else {
                int i = scan.nextInt();
                if (i == 0) return array;
                array.add(i);
                System.out.println("Enter the next integer or press 0 to create an array: ");
            }
        }
    }
}
