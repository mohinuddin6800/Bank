package com.khwaja;

public class Main {
public static void main (String[] args) {
	Account KhwajaAccount=new Account("1234", 0.0, "Khwaja", "Khwaja123@gmail.com","1234");
	KhwajaAccount.DepositeMoney(100);
	KhwajaAccount.WithdrawMoney(200);
}
}
