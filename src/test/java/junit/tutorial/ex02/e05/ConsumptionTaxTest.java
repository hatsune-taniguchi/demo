package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConsumptionTaxTest {

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
	void test1() {
		ConsumptionTax consumptionTax = new ConsumptionTax(5);
		int result1 = consumptionTax.apply(100);
		assertEquals(105, result1);
		// System.out.println(result1);

		int result2 = consumptionTax.apply(3000);
		assertEquals(3150, result2);

		int result3 = consumptionTax.apply(50);
		assertEquals(52, result3);
	}

	@Test
	void test2() {
		ConsumptionTax consumptionTax = new ConsumptionTax(10);
		int result1 = consumptionTax.apply(50);
		assertEquals(55, result1);
	}

	@Test
	void test3() {
		ConsumptionTax consumptionTax = new ConsumptionTax(3);
		int result1 = consumptionTax.apply(50);
		assertEquals(51, result1);
	}

}
