package com.opps.third;

public class ThirdAssign {

	public static void main(String[] args) {
		
		Branch brf = new Branch("br11", "icici", "icici indore");
		Branch brs = new Branch("br22", "hdfc", "hdfc indore");
		
		CustomerAccountStatement casff = new CustomerAccountStatement("cAID124", "cus124", "10000", "deposit", "21-10-2010");
		CustomerAccountStatement casfs = new CustomerAccountStatement("cAID124", "cus124", "1000", "withdraw", "23-01-2011");
		CustomerAccountStatement casft = new CustomerAccountStatement("cAID124", "cus124", "500", "withdraw", "03-10-2011");
		CustomerAccountStatement casffh = new CustomerAccountStatement("cAID124", "cus124", "5000", "deposit", "15-10-2011");
		
		CustomerAccountStatement casf = new CustomerAccountStatement("cAID123", "cus123", "1000", "deposit", "21-10-2020");
		CustomerAccountStatement cass = new CustomerAccountStatement("cAID123", "cus123", "1000", "deposit", "22-10-2020");
		CustomerAccountStatement cast = new CustomerAccountStatement("cAID123", "cus123", "500", "withdraw", "23-10-2020");
		
		Customer cusf = new Customer("cus123", "123", "Ram", "Indore", "21-09-2013", "21-10-2020", brf);
		
		Customer cuss = new Customer("cus124", "124", "Ram", "Indore", "11-09-2010", "21-10-2010", brs);
		
		cusf.printCustomer();
		cuss.printCustomer();
		
	}

}
