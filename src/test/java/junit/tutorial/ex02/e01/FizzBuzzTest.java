package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();

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
	void test16() {
		
		//split�Ŕz��ɂ��ă��X�g�ɕϊ��BassertIterableEquals���g���Ă��B
		//���X�g�ƃ��X�g����ׂ�B

		List<String> result = fizzBuzz.createFizzBuzzList(16);
		List<String> expectation = new ArrayList<>();
		expectation.add("1");
		expectation.add("2");
		expectation.add("Fizz");
		expectation.add("4");
		expectation.add("Buzz");
		expectation.add("Fizz");
		expectation.add("7");
		expectation.add("8");
		expectation.add("Fizz");
		expectation.add("Buzz");
		expectation.add("11");
		expectation.add("Fizz");
		expectation.add("13");
		expectation.add("14");
		expectation.add("FizzBuzz");
		expectation.add("16");
		assertEquals(expectation, result, "test16()�G���[");
		// ���Ғl�A���ۂ̒l�A�G���[���b�Z�[�W

	}

}
