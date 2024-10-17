//Задание 1. Нахождение факториала числа
//        Напишите метод factorial, который принимает число n и возвращает его
//        факториал. Если число n < 0, метод должен вернуть -1.

package Homework_Sem1;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        factorialN(printN());
    }

    public static void factorialN(int N) {
        if (N == 404) {
            System.out.println("Error! The console accepts only integers!");
        } else {
            int factorial = 1;
            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }
            System.out.println("factorial N = " + factorial);
        }
    }

    public static int printN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial:  ");

        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            if (N < 0) {
                return 1;
            } else return N;
        } else return 404;
    }
}
