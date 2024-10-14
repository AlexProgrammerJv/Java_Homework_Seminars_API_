package Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        printEvenNums(printN());
    }

    public static void printEvenNums(int N) {
        if (N == 1) {
            System.out.println("The input number is less than 0");
        } else if (N == 2) {
            System.out.println("Error! The console accepts only integers!");
        } else for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int printN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to show even numbers in the range  :  ");

        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            if (N < 0) {
                return 1;
            } else return N;
        } else return 2;
    }

}
