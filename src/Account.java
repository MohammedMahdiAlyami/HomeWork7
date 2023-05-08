public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (this.balance < amount) {
            System.out.println("There is no enough balance..!");
        }
        this.balance -= amount;
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (this.balance < amount) {
            System.out.println("There is no enough balance..!");
        }
        this.balance -= amount;
        another.credit(amount);
        return this.balance;
    }

    @Override
    public String toString() {
        return "{Account ID: " + this.id + ", Name: " + this.name + ", Balance: " + this.balance+ '}';
    }
}

