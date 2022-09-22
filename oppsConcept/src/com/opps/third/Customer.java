package com.opps.third;

public class Customer {

	String custId;
	String accountno;
	String custName;
	String custAddress;
	String custDob;
	String custAccountOpeningDate;
	Branch branchObj;
	
	public Customer(String custId, String accountno, String custName, String custAddress, String custDob,
			String custAccountOpeningDate, Branch branchObj) {
		this.custId = custId;
		this.accountno = accountno;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custDob = custDob;
		this.custAccountOpeningDate = custAccountOpeningDate;
		this.branchObj = branchObj;
	}
	
	public void printCustomer(){
		System.out.println("custId.."+custId);
		System.out.println("accountno.."+accountno);
		System.out.println("custName.."+custName);
		System.out.println("custAddress.."+custAddress);
		System.out.println("custDob.."+custDob);
		System.out.println("custAccountOpeningDate.."+custAccountOpeningDate);
		branchObj.printBranch();
//		System.out.println("branchObj.."+branchObj.printBranch());
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustDob() {
		return custDob;
	}
	public void setCustDob(String custDob) {
		this.custDob = custDob;
	}
	public String getCustAccountOpeningDate() {
		return custAccountOpeningDate;
	}
	public void setCustAccountOpeningDate(String custAccountOpeningDate) {
		this.custAccountOpeningDate = custAccountOpeningDate;
	}
	public Branch getBranchObj() {
		return branchObj;
	}
	public void setBranchObj(Branch branchObj) {
		this.branchObj = branchObj;
	}
	
}
