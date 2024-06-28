import java.util.Scanner;
public class ATM
{
private BankAccount account;
public ATM(BankAccount account)
{
this.account=account;
}
public void start()
{
System.out.println("stay up to date!");
System.out.println("1.check Balance");
System.out.println("2.deposit");
System.out.println("3.withdraw");
System.out.println("4.Exit");
}
private void checkBalance()
{
System.out.println("your current balance is:$"+account.getBalance());
}
public void deposit(double amount)
{
account.deposit(amount);
}
public void withdraw(double amount)
{
account.withdraw(amount);
}

public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
BankAccount account=new BankAccount(2000);
ATM atm=new ATM(account);
atm.start();
System.out.print("choose an option:");
int option=scanner.nextInt();
switch(option)
{
case 1:
atm.checkBalance();
break;
case 2:
System.out.println("enter deposit amount:");
double depositAmount=depositAmount=scanner.nextDouble();
break;
case 3:
System.out.println("enter withdraw amount:");
double withdrawAmount=scanner.nextDouble();
atm.withdraw(withdrawAmount);
break;
case 4:
System.out.println("thanks for using ATM!");
scanner.close();
return;
default:
System.out.println("The option is not correct.  please try again later!.");
}
}
}
