package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RangeTest {

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
	void test() {

		Range range = new Range(0.0, 10.5);

		boolean result1 = range.contains(-0.1);
		assertEquals(false, result1);

		boolean result2 = range.contains(0.0);
		assertEquals(true, result2);

		boolean result3 = range.contains(10.5);
		assertEquals(true, result3);

		boolean result4 = range.contains(10.6);
		assertEquals(false, result4);
		
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);

	}

	@Test
	void test2() {

		Range range = new Range(-5.1, 5.1);

		boolean result1 = range.contains(-5.2);
		assertEquals(false, result1);

		boolean result2 = range.contains(-5.1);
		assertEquals(true, result2);

		boolean result3 = range.contains(5.1);
		assertEquals(true, result3);

		boolean result4 = range.contains(5.2);
		assertEquals(false, result4);
		
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);

	}

}
