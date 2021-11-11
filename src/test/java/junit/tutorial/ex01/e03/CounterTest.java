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
		assertEquals(1, result, "increment()�G���[�I");
		// ���Ғl�A���ۂ̒l�A�G���[���b�Z�[�W
	//	 System.out.println(result);
	}

	@Test
	void testIncrement1() {
		counter.increment();
		int result = counter.increment();
		assertEquals(2, result, "increment1()�G���[");
		 System.out.println(result);
	}

//increment���\�b�h��50����s������w��increment���\�b�h�����s�����51���擾�ł���
	@Test
	void testIncrement50() {

		for (int i = 1; i <= 50; i++) {
			counter.increment();
		}

		int result = counter.increment();
		assertEquals(51, result, "increment50()�G���[�I");
		System.out.println(result);

	}

}
