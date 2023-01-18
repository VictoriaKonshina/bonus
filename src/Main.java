public class Main {
    public static void main(String[] args) {

        int balance = 100; //cумма счета
        int addBalance = 1100; //cумма пополнения
        int sum = balance+addBalance; //итоговая сумма
        int addBonus;

        if (sum >=1000) {
            addBonus = addBalance / 100;
        } else {
            addBonus = 0;
        }
        int score = sum + addBonus;

            System.out.println("Итоговый баланс счета:" + score);
            System.out.println("Количество бонусов:" + addBonus);
        }
    }

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.