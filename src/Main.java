public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int sumUp = 1100;
        int bonus;
        int total;
        if (sumUp >= 1001) {
            bonus = sumUp / 100;
            total = balance + sumUp + bonus;
            System.out.println("Итоговый счёт: " + total + " руб.");
            System.out.println("Количество бонусов: " + bonus + " руб.");
        } else {
            System.out.println("Итоговый счёт: " + (sumUp + balance + " руб."));
            System.out.println("Количество бонусов: " + 0 + " руб.");
        }
    }
}
