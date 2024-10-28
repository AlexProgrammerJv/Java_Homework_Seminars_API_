package Homework_Sem2;

public class Homewkr4 {
    public static void main(String[] args) {
        int number = 1000;
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 & i % 5 != 0)
            {
                if (SumNumber(i) < 10) System.out.println(i);
            }
        }
    }

    public static int SumNumber(int i) {
        int sum = 0;
        while (i > 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
