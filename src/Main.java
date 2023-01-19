public class Main {
    public static void main(String[] args) {

        int balance = 100; //cумма счета
        int addBalance = 1100; //cумма пополнения
        int sum = balance + addBalance; //итоговая сумма
        int addBonus;

        if (sum >= 1000) {
            addBonus = addBalance / 100;
        } else {
            addBonus = 0;
        }
        int score = sum + addBonus;

        System.out.println("Итоговый баланс счета:" + score);
        System.out.println("Количество бонусов:" + addBonus);
    }
}
