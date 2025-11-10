package d.inheritance.practice_01;

class Account{
    String accountNumber;
    double balance;
    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount){
        balance += amount;
        System.out.println(amount + " 입금");
    }
    void withdraw(double amount){
        if(balance >= amount) {
            balance -= amount;
            System.out.println(amount + " 출금");
        } else System.out.println("잔액부족");

    }
}

class SavingsAccount extends Account{
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest(){
        balance = balance + (balance * interestRate);
    }
}

class CheckingAccount extends Account {
    int overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, int overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount) {

        //if(balance >= (overdraftLimit*-1)){
        if(balance + overdraftLimit >= amount) {
            balance -= amount;
        } else System.out.println("출금 불가");
    }
}


public class AccountMain {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA001", 1000000, 0.03);
        savings.deposit(500000);
        savings.addInterest();
        System.out.println("저축예금 잔액: " + savings.balance);

        CheckingAccount checking = new CheckingAccount("CA001", 100000, 500000);
        checking.withdraw(400000);
        System.out.println("입출금예금 잔액: " + checking.balance);
    }
}
