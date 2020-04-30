import java.util.Scanner;
abstract class Account{
	long accountNumber;
	String accountHolderName;
	long amount;
	public abstract void deposit(long cash);
	public abstract void withdraw(long cash);
}
class SBAccount extends Account{
	public SBAccount(long accountNumber,String accountHolderName,long amount){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.amount= amount;
	}
	public void deposit(long cash){
		amount  = amount+cash;
		System.out.println("Your Account Balance : "+amount);	
	}
	public void withdraw(long cash){
		if(amount < 500){
			System.out.println("U cant withdraw money - minimum balance");
		}else{
			amount  = amount-cash;
			System.out.println("Your Account Balance : "+amount);
		}
	}
}
class CurrentAccount extends Account{
	public CurrentAccount(long accountNumber,String accountHolderName,long amount){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.amount= amount;
	}
	public void deposit(long cash){
		amount  = amount+cash;
		System.out.println("Your Account Balance : "+amount);
		
	}
	public void withdraw(long cash){
		if(amount < 500){
			System.out.println("U cant withdraw money - minimum balance");
		}else{
			amount  = amount-cash;
			System.out.println("Your Account Balance : "+amount);
		}
	}
}
public class BankAccounts{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("To Open: \n1-SBAccount\n2-CurrentAccount\n");
		int num = sc.nextInt();
		switch(num){
			case 1:
			SBAccount sb = new SBAccount(100,"Neha",10000);
			System.out.println("1-Deposit\n2-Withdraw\n");
			int n = sc.nextInt();
			switch(n){
				case 1:
				System.out.println("Enter the amount to deposit : ");
				long cash1 = sc.nextLong();
				sb.deposit(cash1);
				break;
				case 2:
				System.out.println("Enter the amount to withdraw : ");
				long cash2 = sc.nextLong();
				sb.withdraw(cash2);
				break;
			}
			break;
			case 2:
			CurrentAccount ca = new CurrentAccount(200,"Neha",20000);
			System.out.println("1-Deposit\n2-Withdraw\n");
			int n1 = sc.nextInt();
			switch(n1){
				case 1:
				System.out.println("Enter the amount to deposit : ");
				long cash3 = sc.nextLong();
				ca.deposit(cash3);
				break;
				case 2:
				System.out.println("Enter the amount to withdraw : ");
				long cash4 = sc.nextLong();
				ca.withdraw(cash4);
				break;
			}
			break;
			default:System.out.println("Enter the number between(1-3)");
		}
	}
}