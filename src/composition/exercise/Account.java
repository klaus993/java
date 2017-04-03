package composition.exercise;

/**
 * Created by Klaus on 3/4/2017.
 */
public class Account {

    int ID;
    Customer customer;
    double balance;

    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, Customer customer) {
        this.balance = 0.0;
        this.ID = ID;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return this.customer.toString() + "balance=$" + this.balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException();
        } else {
            this.balance -= amount;
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }
}
