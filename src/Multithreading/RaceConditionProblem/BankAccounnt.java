package Multithreading.RaceConditionProblem;

class BankAccount {
    private int balance = 0;
    // by synchronizing this method we can prevent race condition problem
    // not a good approach though
    public synchronized void deposit(int amount) {
        int newBalance = balance + amount; // Read-modify-write
        // Simulate some delay
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        balance = newBalance;
    }

    public int getBalance() {
        return balance;
    }
}