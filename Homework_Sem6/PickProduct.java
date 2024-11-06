package Homework_Sem6;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PickProduct {

    public Set<String> peekProduct() {
        Set<String> setProduct = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в магазин цифровой техники!" + "\n" +
                "Какой товар нашего магазина вас интересует? " + "\n" +
                "Введите цифру интересующего товара:" +
                "1 -> Телефоны " + "\n" +
                "2 -> Ноутбуки");
        while (true) {
            if (scan.hasNextInt()) {
                if (scan.nextInt() == 1) {
                    System.out.println("Введите интерисующие Вас критерии поиска телефона: " + "\n"
                            + "1 -> Производитель" + "\n"
                            + "2 -> Операционная система" + "\n"
                            + "3 -> Цена" + "\n");
                    int i = scan.nextInt();
                    if (i == 1) {
                        System.out.println("В нашем магазине имеется производители следующих марок:" + "\n"
                                + "1 - Apple" + "\n"
                                + "2 - Samsung" + "\n"
                                + "3 - Xiaomi");
                        int creator = scan.nextInt();
                        if (creator == 1) setProduct.add("Apple");
                        if (creator == 2) setProduct.add("Samsung");
                        if (creator == 3) setProduct.add("Xiaomi");
                    }
                    if (i == 2) {
                        System.out.println("В нашем магазине имеются телефоны с операционными системами:" + "\n"
                                + "1 - Android" + "\n"
                                + "2 - IOS");
                        int os = scan.nextInt();
                        if (os == 1) setProduct.add("Android");
                        if (os == 2) setProduct.add("IOS");
                    }
                    if (i == 3) {
                        System.out.println("В нашем магазине имеются телефоны стоимостью:" + "\n"
                                + "1 - 47.000 руб" + "\n"
                                + "2 - 60.000 руб" + "\n"
                                + "3 - 21.000 руб");
                        int price = scan.nextInt();
                        if (price == 1) setProduct.add("47.000 руб");
                        if (price == 2) setProduct.add("60.000 руб");
                        if (price == 3) setProduct.add("21.000 руб");
                    }
                }
            } else {
                System.out.println("Ошибка! Ввести нужно только цифру интересующего товара: " + "\n"
                        + "1 -> Телефоны " + "\n"
                        + "2 -> Ноутбуки");
                scan.next();
            }
            return setProduct;
        }
    }
}




