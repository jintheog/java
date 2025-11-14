package h.exception;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }


    public static void main(String[] args) {
        BankAccount ba = new BankAccount(10000);
        ba.withdraw(1000);
        System.out.println(ba.balance);
    }
}
