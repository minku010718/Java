class BankAccount {
    private String accountHolder;
    private double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println((int)amount + "원 입금완료, 현재잔액 : " + (int)balance + "원");
    }

    void withdraw(double amount) {
        if(balance - amount < 0) {
            System.out.println("출금양이 예금잔액보다 많아서 프로그램을 종료합니다.");
            System.exit(-1);
        }

        balance -= amount;
        System.out.println((int)amount + "원 출금완료, 현재잔액 : " + (int)balance + "원");
    }

    void getBalance() {
        System.out.println("현재잔액 : " + (int)balance);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(5000);
        ba.withdraw(2000);
        ba.getBalance();
    }
}
