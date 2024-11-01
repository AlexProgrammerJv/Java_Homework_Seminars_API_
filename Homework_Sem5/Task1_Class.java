//Задание 1. Студенческий справочник
//Реализуйте программу для работы с простым справочником студентов.
//Программа должна иметь следующие функции:
// ● addStudent(String name, Integer grade): Добавляет или
//обновляет запись о студенте с именем name и оценкой grade. Если
//студент уже существует, обновляет его оценку.
// ● findStudent(String name): Находит оценки студента по его имени.
//Если студент существует, возвращает список его оценок. Если нет —
//пустой список.
// ● getAllStudents(): Возвращает весь справочник студентов в виде
//HashMap, где ключи — имена студентов, а значения — списки их оценок.
// ● removeStudent(String name): Удаляет запись о студенте по имени
//из справочника. Если запись не существует, ничего не происходит.

package Homework_Sem5;

import java.util.ArrayList;
import java.util.HashMap;

public class Task1_Class {
    private HashMap<String, Integer> studentMap = new HashMap<>();

    protected void addStudent(String name, Integer grade) {
        studentMap.put(name, grade);
    }

    protected void findStudent(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println(studentMap.get(name));
        } else throw new RuntimeException("List is empty!");
    }

    protected HashMap<String, Integer> getAllStudents(){
        return studentMap;
    }

    protected void removeStudent(String name){
        if (studentMap.containsKey(name)) studentMap.remove(name);
    }
}
