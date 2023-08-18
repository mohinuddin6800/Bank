package com.khwaja;

public class Account {
	private String Number;
	private double Balance;
	private String Name;
	private String Email;
	private String PhoneNumber;
	
	public Account(String Number, double Balance, String Name, String Email, String PhoneNumber) {
		this.Number=Number;
		this.Balance=Balance;
		this.Name=Name;
		this.Email=Email;
		this.PhoneNumber=PhoneNumber;
	}
	
	public void DepositeMoney(double DepositedMoney) {
		this.Balance+=DepositedMoney;
		System.out.println("Deposite is successul , new Balance is " + this.Balance);
		
	}
	
	public void WithdrawMoney(double WithdrawedMoney) {
		if(this.Balance-WithdrawedMoney<0) {
			System.out.println("Withdraw unsuccessul only " + this.Balance +" is left");
			
		}else {
			this.Balance-=WithdrawedMoney;
			System.out.println("Withdraw successful, Current Balance is " + this.Balance);
		}
	}
public String getNumber() {
		return Number;
	}
	public double getBalance() {
		return Balance;
	}
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
}
