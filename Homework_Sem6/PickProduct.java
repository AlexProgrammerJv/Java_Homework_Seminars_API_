package Homework_Sem6;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PickProduct  {

    void peekProduct() {
        Set<String> set = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в магазин цифровой техники!" + "\n" +
                "Какой товар нашего магазина вас интересует? " + "\n" +
                "Введите цифру интересующего товара:" +
                "1 -> Телефоны " + "\n" +
                "2 -> Ноутбуки");
        while(true) {
            if (!scan.hasNextInt()) {
                System.out.println("Ошибка! Ввести нужно только цифру интересующего товара: " + "\n"
                        + "1 -> Телефоны " + "\n"
                        + "2 -> Ноутбуки");
                scan.next();
            }
                if (scan.equals(1)) {
                    Scanner scan1 = new Scanner(System.in);
                    System.out.println("Введите интерисующие Вас критерии поиска телефона: " + "\n"
                            + "1 -> Производитель" + "\n"
                            + "2 -> Операционная система" + "\n"
                            + "3 -> Цена" + "\n");
                    if (scan1.equals(1)) {
                        Scanner scan2 = new Scanner(System.in);
                        System.out.println("В нашем магазине имеется производители следующих марок:" + "\n"
                                + "1 - Apple" + "\n"
                                + "2 - Samsung" + "\n"
                                + "3 - Xiaomi");
//                        if (scan2.equals(1))
                    }
                    if (scan1.equals(2)) {
                        Scanner scan2 = new Scanner(System.in);
                        System.out.println("В нашем магазине имеются телефоны с операционными системами:" + "\n"
                                + "1 - Android" + "\n"
                                + "2 - IOS");
                        int ios = scan2.nextInt();

                    }
                    if (scan1.equals(3)) {
                        Scanner scan2 = new Scanner(System.in);
                        System.out.println("В нашем магазине имеются телефоны стоимостью:" + "\n"
                                + "1 - 47.000 руб" + "\n"
                                + "2 - 60.000 руб " + "\n"
                                + "3 - 21.000 руб");
                        int price = scan2.nextInt();
                    }
                }
            }
        }
    }



