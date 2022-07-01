package assignment11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		Singleton st1= Singleton.getSingleton();
		Singleton st2= Singleton.getSingleton();
		
		assertTrue(SingletonCheck.checksingleton(st1, st2));

		
	}

}
