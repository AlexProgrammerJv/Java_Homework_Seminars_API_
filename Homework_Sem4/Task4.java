//Задача 4. Сдвиг очереди
//Реализуйте метод rotateDeque в классе DequeTasks, который принимает
//Deque<Integer> и число n. Метод должен повернуть очередь вправо на n
//позиций. Если n отрицательное, повернуть влево.

package Homework_Sem4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int i = queueIndex();
        Deque<Integer> dq = addNumbersInArray();
        System.out.println(moveList(dq, i));
    }

    public static Deque<Integer> moveList(Deque<Integer> list, int queue) {

        int count = 0;
        for (Integer i : list) {
            count++;
            if (queue < 0) {
                int left = queue * -1;
                if (count <= left) {
                    list.pollFirst();
                    list.addLast(i);
                }
            } else {
                list.push(list.pollLast());
                if (count == queue) return list;
            }
        }
        return list;
    }

    public static int queueIndex() {
        System.out.println("Enter the number to move the queue");
        Scanner i = new Scanner(System.in);
        int queue = i.nextInt();
        return queue;
    }

    private static Deque<Integer> addNumbersInArray() {
        Deque<Integer> array = new ArrayDeque<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer to create an array: ");
        while (true) {
            if (scan.hasNextInt()) {
                int i = scan.nextInt();
                if (i == 0) return array;
                array.add(i);
                System.out.println("Enter the next integer or press 0 to create an array: ");
            } else {
                String exit = scan.nextLine();
                if (exit.equals("q")) return array;
                System.out.println("Error! Enter the data is not a integer!" + "\n" +
                        "Reepeat enter the integer: ");
                scan.next();
            }
        }
    }
}
