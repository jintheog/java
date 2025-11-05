package b.oop.practice_oop;

public class BankAccount {
    String accountNumber;
    int balance;
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(int amount) {
        balance += amount;
        System.out.printf("입금 %d원, 잔액: %d원\n",amount, balance);
    }
    public void withdraw(int amount) {
        balance -= amount;
        System.out.printf("출금 %d원, 잔액: %d원\n", amount, balance);
    }
    public int getBalance() {
        return balance;
    }

}
