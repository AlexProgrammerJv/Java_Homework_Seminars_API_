package Hmwrk6_part2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Object> map = new HashMap<>();
       while (scan.hasNextInt()) {
           map.put("Hello", scan.nextInt());

       }
    }
}
