//Задача 2. Реализация стека
//Реализуйте MyStack с использованием LinkedList с методами:
//● push(String element) - добавляет элемент на вершину стека
//● pop() - возвращает элемент с вершины и удаляет его
//● peek() - возвращает элемент с вершины, не удаляя
//● getElements() - возвращает все элементы стека

package Homework_Sem4;

import java.util.LinkedList;

public class MyStack {
    private LinkedList<String> list = new LinkedList<>();

    public void push(String el) {
        list.add(el);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public String peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return list.get(list.size() - 1);
    }

    public LinkedList<String> getElements() {
        return list;
    }

    public String pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        String line = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return line;
    }



}
