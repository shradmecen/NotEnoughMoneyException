// Klasa Account
class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    // Konstruktor
    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Gettery i settery
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Metoda symulująca wykonanie przelewu
    public void transfer(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            throw new NotEnoughMoneyException("Niewystarczająca ilość środków na koncie.");
        } else {
            balance -= amount;
            System.out.println("Przelew wykonany, pozostały stan konta: " + balance);
        }
    }
}
