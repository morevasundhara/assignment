package assignment12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() throws CloneNotSupportedException {
		
		Code12 c1=new Code12(101,"vasu");
		Code12 c2=(Code12)c1.clone();
		assertEquals(true,Code12.checkClone(c1, c2));

	
	}

}
