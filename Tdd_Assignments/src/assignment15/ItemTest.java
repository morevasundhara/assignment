package assignment15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ItemTest {

	@Test
	void test() {
		Item i=new Item(123,"vasu",100,150,LocalDate.of(2020, 11, 23),LocalDate.of(2020, 12, 27));
		assertEquals(true,i.createObject(i));
	}

}
