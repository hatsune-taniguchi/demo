package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class e01 {

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
	void testToSnakeCase() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result, "toSnakeCase(aaa)エラー！");
		// 期待値、実際の結果、エラーメッセージ
		System.out.println(result);
	}

	@Test
	void testToSnakeCase1() {
		String result2 = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result2, "toSnakeCase1(HelloWorld)エラー！");
		System.out.println(result2);
	}

	@Test
	void testToSnakeCase2() {
		String result3 = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result3, "toSnakeCase2(practiceJunit)エラー！");
		System.out.println(result3);
	}

}
