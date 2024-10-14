package Homework;

import java.util.Scanner;

public class Homework4
{
    public static void main(String[] args)
    {
        System.out.println(findMaxOfThree(20,100, 10));
    }
    public static int findMaxOfTwo(int a, int b)
    {
        if (a > b) return a;
        else return b;
    }
    public static int findMaxOfThree(int a, int b, int c)
    {
        if (findMaxOfTwo(a,b) < c ) return c;
        else return findMaxOfTwo(a,b);
    }
}
