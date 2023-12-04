package assignment;

public class BankAccount {
    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount || balance <= 0) {
            System.out.println("Sorry, you don't have enough to withdraw that amount");
        } else {
            balance -= amount;
        }
    }
}
