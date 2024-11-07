package Homework_Sem6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(
                "Apple",
                "IOS",
                4,
                6.1,
                2815,
                46.599);
        Phone phone2 = new Phone(
                "Samsung",
                "Android",
                8,
                6.4,
                4500,
                59.999);
        Phone phone3 = new Phone(
                "Xiaomi",
                "Android",
                8,
                6.67,
                5000,
                20.999);

        Laptop laptop1 = new Laptop(
                "HP",
                "Windows",
                16,
                13,
                6060,
                43_000);
        Laptop laptop2 = new Laptop(
                "Lenovo",
                "Windows",
                8,
                13,
                7200,
                48_000);
        Laptop laptop3 = new Laptop(
                "Asus",
                "Linux",
                16,
                14,
                6500,
                52_000);


        Set<ElectronicsStore> setStore = new HashSet<>();
        setStore.add(phone1);
        setStore.add(phone2);
        setStore.add(phone3);
        setStore.add(laptop1);
        setStore.add(laptop2);
        setStore.add(laptop3);

        PickProduct pick = new PickProduct();
        Set<Object> param = pick.peekProduct();

        for (ElectronicsStore product : setStore) {
            if (product.ofParam(param)) System.out.println(product);
        }
    }
}


