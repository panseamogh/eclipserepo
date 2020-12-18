package com.lti.junit.demo;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class JUnitEmpOperationsTest {
	@BeforeClass
	public  static void setDatabaseConnectivity(){
		System.out.println("connection is eastablished");
	}
	
	@Test
	public void TestCheckLogin(){
	//no need to write code for connection openeing	
		//Username and password fetched from database
		String username="admin";
		String password="123";
		assertEquals("true",EmployeeOperations.checkloginoperation(username, password));
		//no need to write code for closing connection it will be closed in
		//closeDatabaseConnectivity marked with AfterClass
	
	}
	@Test
	public void TestCheckDepartment(){	//no need to write code for closing connection it will be closed in
		//closeDatabaseConnectivity marked with AfterClass
	
	}
	
	
	@Test
	public void CalculateAge(){
		
		//no need to write code for closing connection it will be closed in
		//closeDatabaseConnectivity marked with AfterClass
	
	}
	
	
	
	@AfterClass
	public static void closeDatabaseConnectivity(){
		System.out.println("Database connection is closed");
	}

}
