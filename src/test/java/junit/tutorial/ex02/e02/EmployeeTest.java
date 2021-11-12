package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xmlunit.builder.Input;

class EmployeeTest {

	Employee employee = new Employee();

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

	// テキストファイルを指定してメソッドを実行すると、名前、名字、メールアドレスが反映された
	// Employeeオブジェクトのリストを取得できる

//inputStreamを調べる
	// リストに詰めて、リストから取得する
	@Test
	void testEmployeeLoad() {

		InputStream input = getClass().getResourceAsStream("Employee.txt");

		// テキストファイルを指定してメソッドを実行すると、
		// 名前、名字、メールアドレスが反映されたEmployeeオブジェクトのリストを取得できる

		List<Employee> result = Employee.load(input);

		Employee employee2 = result.get(0);//一行のデータだけが入っている

		assertEquals("Ichiro", employee2.getFirstName(), "エラー");
		assertEquals("Tanaka", employee2.getLastName(), "エラー1");
		assertEquals("ichiro@example.com", employee2.getEmail(), "エラー2");

	}
}
