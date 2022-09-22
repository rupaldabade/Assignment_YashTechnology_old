package com.opps.third;

public class Branch {

	String branchId;
	String branchName;
	String branchAddress;
	
	public Branch(String branchId, String branchName, String branchAddress) {
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
	}
	
	public void printBranch(){
		System.out.println("branchId.."+branchId);
		System.out.println("branchName.."+branchName);
		System.out.println("branchAddress.."+branchAddress);
	}
	
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
}
