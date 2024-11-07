package Homework_Sem6;


import java.util.*;

public class PickProduct {


    public Set<Object> peekProduct() {
        Set<Object> setParam = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в магазин цифровой техники!" + "\n" +
                "Какой товар нашего магазина вас интересует? " + "\n" +
                "Введите цифру интересующего товара:" + "\n" +
                "1 -> Телефоны " + "\n" +
                "2 -> Ноутбуки");
        while (true) {
            if (scan.hasNextInt()) {
                int j = scan.nextInt();
                if (j == 1) {
                    System.out.println("Введите интерисующие Вас критерии поиска телефона: " + "\n"
                            + "1 -> Производитель" + "\n"
                            + "2 -> Операционная система" + "\n"
                            + "3 -> Цена" + "\n");
                    int i = scan.nextInt();
                    if (i == 1) {
                        scan.nextLine();
                        System.out.println("В нашем магазине имеется производители следующих производителей:" + "\n"
                                + "Apple" + "\n"
                                + "Samsung" + "\n"
                                + "Xiaomi" + "\n");
                        System.out.println("Введите название производителя:");
                        setParam.add(scan.nextLine());
                    }
                    if (i == 2) {
                        scan.nextLine();
                        System.out.println("В нашем магазине имеются телефоны с операционными системами:" + "\n"
                                + "Android" + "\n"
                                + "IOS" + "\n");
                        System.out.println("Введите название OS:");
                        setParam.add(scan.nextLine());
                    }
                    if (i == 3) {
                        scan.nextLine();
                        System.out.println("В нашем магазине имеются телефоны стоимостью:" + "\n"
                                + "47.000 руб" + "\n"
                                + "60.000 руб" + "\n"
                                + "21.000 руб" + "\n");
                        System.out.println("Введите цену:");
                        setParam.add(scan.nextDouble());
                    }
                }
                if (j == 2) {
                    System.out.println("Введите интерисующие Вас критерии поиска ноутбука: " + "\n"
                            + "1 -> Производитель" + "\n"
                            + "2 -> Операционная система" + "\n"
                            + "3 -> Диагональ монитора" + "\n");
                    int i = scan.nextInt();
                    if (i == 1) {
                        scan.nextLine();
                        System.out.println("В нашем магазине имеется производители следующих производителей:" + "\n"
                                + "HP" + "\n"
                                + "Lenovo" + "\n"
                                + "Asus" + "\n");
                        System.out.println("Введите название производителя:");
                        setParam.add(scan.nextLine());
                    }
                    if (i == 2) {
                        scan.nextLine();
                        System.out.println("В нашем магазине имеются ноутбуки с операционными системами:" + "\n"
                                + "Windows" + "\n"
                                + "Linux" + "\n"
                                + "Без OS" + "\n");
                        System.out.println("Введите название OS:");
                        setParam.add(scan.nextLine());
                    }
                    if (i == 3) {
                        scan.nextLine();
                        System.out.println("В нашем магазине имеются ноутбуки с диагональю: " + "\n"
                                + "14" + "\n"
                                + "13" + "\n");
                        System.out.println("Введите диагональ:");
                        setParam.add(scan.nextDouble());
                    }
                }
                scan.close();
                return setParam;
            } else {
                System.out.println("Ошибка! Ввести нужно только цифру интересующего товара: " + "\n"
                        + "1 -> Телефоны " + "\n"
                        + "2 -> Ноутбуки");
                scan.next();
            }
        }
    }
}




