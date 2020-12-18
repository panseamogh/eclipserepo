package com.lti.junit.demo;

public class EmployeeOperations {
	
	
	//I want to test this code
	//Create a test case for it
	static String checkloginoperation(String username,String password)
	{
		String result="false";
		if(username.equals("admin")&&password.equals("123")) {
			System.out.println("peform login");
			result="true";
		}
		return result;
	}

}
