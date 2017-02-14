package com.fdmgroup1.firstproject;

public class BankAccountRunner {

	public static void main(String[] args) {
	
		BankAccount adriansAccount = new BankAccount();
		//class name  variable		
		adriansAccount.setAccountName("Adrian");
		System.out.println(adriansAccount.getAccountName());
		adriansAccount.setAccountName("Adrians new name");
		System.out.println(adriansAccount.getAccountName());
		
		
		BankAccount zaksAccount = new BankAccount();
		//class name  variable		
		zaksAccount.setAccountName("Zak");
		System.out.println(zaksAccount.getAccountName());
		zaksAccount.setAccountName("Zak has renamed himself");
		System.out.println(zaksAccount.getAccountName());
		
		
		
		
	}

}
