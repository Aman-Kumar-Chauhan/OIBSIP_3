package com.aman.ATM;
public class ATM {
	
	private int pin=1234;
	private double amount=10000.00;
	private String h1="",h2="",h3="",h4="",h5="";
	public boolean checkPIN(int pin)
	{
		if(pin==this.pin)
			return true;
		return false;
	}
	
	public void getBalance()
	{
		System.out.println("Current balance is Rs. "+amount);
	}
	public void transactionHistory()
	{
		if(h1.isBlank() && h2.isBlank() && h3.isBlank() && h4.isBlank() && h5.isBlank())
			System.out.println("No transaction history...");
		else {
			System.out.println("Your transaction history is :");
			if(!h1.isBlank())
			System.out.println(h1);
			if(!h2.isBlank())
			System.out.println(h2);
			if(!h3.isBlank())
			System.out.println(h3);
			if(!h4.isBlank())
			System.out.println(h4);
			if(!h5.isBlank())
			System.out.println(h5);
		}
	}
	public void withdraw(double amt)
	{
		if(amount<amt)
		{
			System.out.println("Sorry!!! Insufficient balance...");
			return;
		}
		amount-=amt;
		System.out.println("Rs. "+amt+" have been withdrawn from your account...");
		System.out.println("Remaining balance is Rs. "+ amount);
		h5=h4;
		h4=h3;
		h3=h2;
		h2=h1;
		h1="Withdrawn Rs. "+amt;
	}
	public void deposit(double amt)
	{
		amount+=amt;
		System.out.println("Rs. "+amt+" have been deposited in your account...");
		System.out.println("Current balance is Rs. "+ amount);
		h5=h4;
		h4=h3;
		h3=h2;
		h2=h1;
		h1="Deposited Rs. "+amt;
	}
	public void transfer(int toAccountNo,double amt)
	{
		if(amount<amt)
		{
			System.out.println("Sorry!!! Insufficient balance...");
			return;
		}
		amount-=amt;
		System.out.println("Rs. "+amt+" have been transferred to Account having number "+toAccountNo);
		System.out.println("Remaining balance is Rs. "+amount);
		h5=h4;
		h4=h3;
		h3=h2;
		h2=h1;
		h1="Transferred Rs. "+amt+" to acc no. "+toAccountNo;
	}
	public void quit()
	{
		System.out.println("Thanks for using ATM. Visit again...");
	}
}
