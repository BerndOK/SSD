package command.model;

public class BankAccount {
    private int balance;
    public BankAccount() {
        balance = 0;
    }
    public void deposit(int amount) {
        assert (amount > 0);
        balance += amount;
    }
    public void withdraw(int amount) {
        assert (amount > 0 && balance >= amount);
        balance -= amount;
    }
    public int getBalance() {
        return balance;
    }
}
