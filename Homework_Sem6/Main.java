package Homework_Sem6;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone(
                "Apple",
                "IOS",
                4,
                6.1,
                2815,
                46.599);
//        Phone phone2 = new Phone(
//                "Samsung",
//                "Android",
//                8,
//                6.4,
//                4500,
//                59.999);
//        Phone phone3 = new Phone(
//                "Xiaomi",
//                "Android",
//                8,
//                6.67,
//                5000,
//                20.999);

        PickProduct pick = new PickProduct();
        System.out.println(phone1.showPhone(pick.peekProduct()));





    }

}


