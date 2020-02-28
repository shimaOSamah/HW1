package test;

import static org.junit.Assert.*;


import org.junit.Test;

import code.Calc;






public class TestCalc {
	
	@Test
	public void testAdd_twoPositive_returnPositive() {
		Calc c = new Calc(); 
		
		int x = 2;
		int y = 4;
		int z = c.sum(x, y);
		
	    assertTrue(z >0);
	}
	
	@Test
	public void testAdd_twoNegative_returnNegative() {
		Calc c = new Calc(); 
		
		int x = -2;
		int y = -4;
		int z = c.sum(x, y);
		
		assertTrue(z <0);
	}
	
	@Test
	public void testAdd_onePtvOneNtv_returnNegative() {
		Calc c = new Calc();
		int x = -2;
		int y = 4;
		int z = c.sum(x, y);
		
		int s = Math.max(x,y); 
		assertTrue(s*z >0); 
	}
	@Test 
	public void testDiv_twoPositive_returnPositive () {
		Calc c = new Calc();
		int x=10;
		int y=5;
		
	
		int z= c.div(x,y);
		
	    assertTrue(z>0); 
	}
	@Test (expected =ArithmeticException.class)
	public void testDiv_subByzero_returnErorr () {
		Calc c = new Calc();
		int x=10;
		int y=0;
		int z= c.div(x,y);
		
	    assertTrue(z>0); 
	}
	

}