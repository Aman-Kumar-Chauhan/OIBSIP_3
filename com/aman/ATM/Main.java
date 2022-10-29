package com.aman.ATM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		ATM atm=new ATM();
			int pin,choice;
			System.out.println("::::WELCOME TO ATM::::");
			System.out.println("Please enter your ATM PIN to use services: ");
			pin=sc.nextInt();
			while(!atm.checkPIN(pin))
			{
				System.out.println("Incorrect PIN please enter again...");
				pin=sc.nextInt();
			}
			choice=0;
			while(choice!=5)
			{
				System.out.println("1. Withdraw\n2. Deposit\n3. Check Transaction History\n4. Transfer\n5. Quit\nEnter your choice:");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.print("Enter amount you want to withdraw: ");
					atm.withdraw(sc.nextDouble());
					break;
				case 2:
					System.out.print("Enter amount you want to deposit: ");
					atm.deposit(sc.nextDouble());
					break;
				case 3:
					atm.transactionHistory();
					break;
				case 4:
					System.out.print("Enter the account number of account to which you want to transfer money: ");
					int acnum=sc.nextInt();
					System.out.print("Enter the amount you want to transfer: ");
					atm.transfer(acnum, sc.nextDouble());
					break;
				case 5:
					atm.quit();
				}
			}
	}

}
