/*
 * Implement a class BankAccount with attributes: account number, holder name, and balance. 
 * Add deposit and withdraw methods with proper validations.
 */
package Q3;
public class BankAccount 
{
    private String accountNumber;
    private long balance;
    private String holderName;

    public BankAccount(String accountNumber, String holderName, long initialBalance) 
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    public void deposit(long amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
        else 
        {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(long amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient balance for withdrawal.");
        } 
        else 
        {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public void displayAccountDetails() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000);
        account.displayAccountDetails();
        
        System.out.println("-------------------------------");

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500); 
        account.displayAccountDetails();
    }
}
