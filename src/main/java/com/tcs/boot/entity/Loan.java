package com.tcs.boot.entity;

public class Loan {
	

	long loanId;
	String borrowName;
	String dateBorrowed;
	int tenure;
	int balanceEMI;
	boolean loanStatu;
	double amount;
	
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public String getBorrowName() {
		return borrowName;
	}
	public void setBorrowName(String borrowName) {
		this.borrowName = borrowName;
	}
	public String getDateBorrowed() {
		return dateBorrowed;
	}
	public void setDateBorrowed(String dateBorrowed) {
		this.dateBorrowed = dateBorrowed;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public int getBalanceEMI() {
		return balanceEMI;
	}
	public void setBalanceEMI(int balanceEMI) {
		this.balanceEMI = balanceEMI;
	}
	public boolean isLoanStatu() {
		return loanStatu;
	}
	public void setLoanStatu(boolean loanStatu) {
		this.loanStatu = loanStatu;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
