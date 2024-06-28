public class BankAccount
{
private double balance;
public BankAccount(double initialBalance)
{
this.balance=initialBalance;
}
public double getBalance()
{
    
return balance;
}
public void deposit(double amount)
{
if (amount > 0)
{
balance+=amount;
}
}
public void withdraw(double amount)
{
if(balance<=0)
{
System.out.println("withdrawal is allowed");
}
if (amount>balance)
{
System.out.println("insufficient amount withdrawal is not allowed");
balance-=amount;
}
}
}
