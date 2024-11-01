//Задача 3. Подсчет продуктов в корзине
//Создайте программу для учета продуктов в корзине. Программа должна
//позволять добавлять, удалять, обновлять количество продуктов, а также
//проверять наличие продуктов в корзине. Используйте HashMap для хранения
//продуктов и их количества.

package Homework_Sem5;

import java.util.HashMap;

public class Task3 {
    private HashMap<String, Integer> shopBasket = new HashMap<>();

    void addProduct(String product, Integer quantity) {
        if(shopBasket.containsKey(product)) shopBasket.put(product ,shopBasket.get(product) + quantity);
        else shopBasket.put(product ,quantity);
    }

    void removeProduct(String product){
        if(shopBasket.containsKey(product)) shopBasket.remove(product);
    }

    void updateQuantity(String product, Integer quantity){
        if(shopBasket.containsKey(product)) shopBasket.put(product , 0);
    }
    void checkProduct(String product) {

    }

}

