package Homework_Sem1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println(canculateSumNumbers(printNumber()));
    }

    public static int printNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the sum of the numbers in its range: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 0) return 0;
            else return n;
        } else return 1;

    }

    public static int canculateSumNumbers(int n) {

        int sum = 0;
        if (n == 1) System.out.println("Error! The console accepts only integers!");
        else {
            for (int i = 0; i <= n; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
