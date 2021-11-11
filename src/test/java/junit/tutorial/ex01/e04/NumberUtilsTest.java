package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsEven() {
		boolean result = NumberUtils.isEven(10);
		assertEquals(true, result,"testIsEven()エラー");
	//	System.out.println(result);
	}
	@Test
	void testIsEven7() {
		boolean result7 = NumberUtils.isEven(7);
		assertEquals(false, result7,"testIsEven7エラー");
	//	System.out.println(result7);
	}

}
