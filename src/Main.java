import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        int moneySize = 53;
        int depositMoney = 1200;
        int bonusMoney;

        if (depositMoney > 1000) {
            bonusMoney = depositMoney / 100;
            moneySize = moneySize + depositMoney + bonusMoney;
        }
        else {
            bonusMoney = 0;
            moneySize = moneySize + depositMoney;
        }
        {
        System.out.println("Бонус за пополнение:" + bonusMoney);
        System.out.println("Денег на счету:" + moneySize);
    }
    }
}