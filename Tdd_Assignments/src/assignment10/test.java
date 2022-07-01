package assignment10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon",Code10.concat(new String[] {"apple","orange","banana","lemon"}));
	}

}
