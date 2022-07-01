package assignment3;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() throws ClassNotFoundException, SQLException {
		assertTrue(Code.email("vasundhara1234@gmail.com", "vasu1234"));

	}

}