package com.fdmgroup1.firstproject;

public class BankAccount {

	private int accountId;
	private double accountBalance;
	private String accountName;
	private final int overdraftValue = 1000;
	
	
	static int numberOfAccounts=0;
	
	BankAccount(){
		
	}
	
	
	BankAccount(int accountId, double accountBalance, String accountName){
		this();
		this.accountId=accountId;
		this.accountBalance=accountBalance;
		this.accountName=accountName;
		
	}
	BankAccount(double accountBalance, String accountName){
		this(123,accountBalance,accountName);
		this.accountBalance=accountBalance;
		this.accountName=accountName;
	}
	
	public int getAccountId(){
		return accountId;
		
	}
	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setAccountId(int accountId){
		this.accountId= accountId;
	}
	
	public String getAccountName(){
		return accountName;
	}
	
	public void setAccountName(String accountName){
		this.accountName=accountName;
	}
	
	

	
	}

