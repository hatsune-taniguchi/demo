package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	Counter counter = new Counter();

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
	void testIncrement() {

		int result = counter.increment();
		assertEquals(1, result, "increment()エラー！");
		// 期待値、実際の値、エラーメッセージ
	//	 System.out.println(result);
	}

	@Test
	void testIncrement1() {
		counter.increment();
		int result = counter.increment();
		assertEquals(2, result, "increment1()エラー");
		 System.out.println(result);
	}

//incrementメソッドを50回実行した状謡でincrementメソッドを実行すると51が取得できる
	@Test
	void testIncrement50() {

		for (int i = 1; i <= 50; i++) {
			counter.increment();
		}

		int result = counter.increment();
		assertEquals(51, result, "increment50()エラー！");
		System.out.println(result);

	}

}
