package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
	void testdivide() {
		try {
			Calculator calculator = new Calculator();
			calculator.divide(3, 0);
			fail("テストが失敗ですよ");

		} catch (IllegalArgumentException e) {
			assertEquals("divide by zero.", e.getMessage(), "例外のメッセージが異なります");
			// 期待値、実際の結果、エラーメッセージ

			// 成功
		//	e.printStackTrace();
			System.out.println("テスト成功");
		}

	}
}