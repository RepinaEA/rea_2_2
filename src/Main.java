public class Main {
    public static void main(String[] args) {

        int startingScore = 100; //начальный счет
        int replenishmentAmount = 7150; //сумма пополнения
        int bonus; //бонусные рубли
        int finalScore; //итоговый счет

        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;

        } else {
            bonus = 0;
        }
        finalScore = startingScore + replenishmentAmount + bonus;

        System.out.println("Итоговый счет: " + finalScore);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
