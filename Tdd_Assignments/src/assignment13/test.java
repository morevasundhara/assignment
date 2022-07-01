package assignment13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void add() {
		assertEquals(105,Code13.add(15, 90));
	}
	
	@Test
	void sub() {
		assertEquals(-10,Code13.substract(110, 120));
	}
	
	@Test
	void mul() {
		assertEquals(30,Code13.multiply(5, 6));
	}
	
	@Test
	void mod() {
		assertEquals(5,Code13.modulus(15, 10));
	}
	
	@Test
	void pow() {
		assertEquals(25,Code13.power(5));
	}
	
	@Test
	void sqrt() {
		assertEquals(5,Code13.squareroot(25));
	}
	
	@Test
	void cube() {
		assertEquals(2,Code13.cuberoot(8));
	}
	
	@Test
	void testExceptionIsThrown() {
		
		Code13 tester=new Code13();
		assertEquals(2,Code13.divide(4, 2));
		
		try
		{
			assertEquals(2,Code13.divide(1000, 0));
			assertEquals(2,Code13.divide(2, 4));

		}
		catch(ArithmeticException e)
		{
			System.out.println("This line will not be Executed");
			System.out.println("In the catch block due to Exception = "+e);
		}
	}
	
	@Test
	void testExceptionIsThrown2() {
		
		Code13 tester=new Code13();
		assertEquals(0,Code13.modulus(4, 2));
		
		try
		{
			assertEquals(2,Code13.modulus(1000, 0));
			

		}
		catch(ArithmeticException e)
		{
			System.out.println("This line will not be Executed");
			System.out.println("In the catch block due to Exception = "+e);
		}
	}

}
