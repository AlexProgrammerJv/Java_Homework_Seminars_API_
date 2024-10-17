//Задача 4*. Нахождение максимального из трех чисел
//Реализуйте две функции:
//        1. Функция findMaxOfTwo должна принимать два числа и возвращать
//максимальное из них, используя только знак сравнения.
//        2. Функция findMaxOfThree должна принимать три числа и находить
//максимальное из них, используя первую функцию.


package Homework_Sem1;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println(findMaxOfThree(20, 100, 10));
    }

    public static int findMaxOfTwo(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    public static int findMaxOfThree(int a, int b, int c) {
        if (findMaxOfTwo(a, b) < c) return c;
        else return findMaxOfTwo(a, b);
    }
}
