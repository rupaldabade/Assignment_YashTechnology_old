package com.opps.third;

public class CustomerAccountStatement {

	String cAID;
	String custId;
	String amount;
	String depositWithdrawl;
	String depositDate;
	
	public CustomerAccountStatement(String cAID, String custId, String amount, String depositWithdrawl,
			String depositDate) {
		this.cAID = cAID;
		this.custId = custId;
		this.amount = amount;
		this.depositWithdrawl = depositWithdrawl;
		this.depositDate = depositDate;
	}
	
	public void printCustomerAcc(){
		System.out.println("cAID.."+cAID);
		System.out.println("custId.."+custId);
		System.out.println("amount.."+amount);
		System.out.println("depositWithdrawl.."+depositWithdrawl);
		System.out.println("depositDate.."+depositDate);
	}
	
	public String getcAID() {
		return cAID;
	}
	public void setcAID(String cAID) {
		this.cAID = cAID;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDepositWithdrawl() {
		return depositWithdrawl;
	}
	public void setDepositWithdrawl(String depositWithdrawl) {
		this.depositWithdrawl = depositWithdrawl;
	}
	public String getDepositDate() {
		return depositDate;
	}
	public void setDepositDate(String depositDate) {
		this.depositDate = depositDate;
	}
	
	
}
