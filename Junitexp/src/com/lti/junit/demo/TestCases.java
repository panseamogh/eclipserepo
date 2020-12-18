package com.lti.junit.demo;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCases {
	//It will be executed before all the test 
	@BeforeClass  
    public static void setUpBeforeClass() throws Exception {  
        System.out.println("before class");  
        //code for connection opening
    } 
	
	
    @Before  
    public void setUp() throws Exception {  
        System.out.println("before");  
    }  
  
    @Test  
    public void testFindMax(){  
        System.out.println("test case find max");  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        
        //this this failed , the logic was not correct
        assertEquals(12,Calculation.findMax(new int[]{12,-3,-4,-2})); 
        
        
    }  
    @Test  
    public void testCube(){  
        System.out.println("test case cube");  
        assertEquals(27,Calculation.cube(3));  
    }  
    @Test  
    public void testReverseWord(){  
        System.out.println("test case reverse word");  
        assertEquals("ym eman si nahk",Calculation.reverseWord("my name is khan"));  
    }  
    @After  
    public void tearDown() throws Exception {  
        System.out.println("after");  
    }  
    
    
    @Test
    public void checklogin(String username,String password)
    {
    	
    }
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {  
        System.out.println("after class"); 
        //connection closing
    } 
}
