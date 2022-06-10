package com.masai3;

import java.util.Scanner;

public class AccountDetails {

	
	public Account getAccountDetails() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter account id: ");
		int accountId = input.nextInt();
		
		input.nextLine();
		System.out.println("Enter Account type: ");
		String accountType = input.nextLine();
		
		System.out.println("Enter balance: ");
		int accountBalance = input.nextInt();
		
//		System.out.println("Enter amount to be withdrawn: ");
//		int accountWithdraw = input.nextInt();
		
		Account a1 = new Account();
		if(accountBalance > 0) {
			
			a1.setAccountId(accountId);
			a1.setAccountType(accountType);
			a1.setBalance(accountBalance);
		}
		
		else {
			while(accountBalance < 0) {
			System.out.println("Balance should be positive");
//			getAccountDetails();
			System.out.println("Enter balance: ");
			accountBalance = input.nextInt();
			a1.setBalance(accountBalance);
			}
		}
		
		return a1;
			
		
	}
	
	public int getWithdrawAmount() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn: ");
		int accountWithdraw = input.nextInt();
		
		while(accountWithdraw < 0) {
		System.out.println("Amount should be positive");
		System.out.println("Enter amount to be withdrawn: ");
		accountWithdraw = input.nextInt();
		
		}
		return accountWithdraw;
}
	
	public static void main(String[] args) {
		
		AccountDetails ad1 = new AccountDetails();
		
		Account a1 = ad1.getAccountDetails();
		
		
		
		int withDraw = ad1.getWithdrawAmount();
		
		a1.withdraw(withDraw);
	
		
	}
		
	}

