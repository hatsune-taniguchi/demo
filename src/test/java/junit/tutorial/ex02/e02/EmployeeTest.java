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

	// �e�L�X�g�t�@�C�����w�肵�ă��\�b�h�����s����ƁA���O�A�����A���[���A�h���X�����f���ꂽ
	// Employee�I�u�W�F�N�g�̃��X�g���擾�ł���

//inputStream�𒲂ׂ�
	// ���X�g�ɋl�߂āA���X�g����擾����
	@Test
	void testEmployeeLoad() {

		InputStream input = getClass().getResourceAsStream("Employee.txt");

		// �e�L�X�g�t�@�C�����w�肵�ă��\�b�h�����s����ƁA
		// ���O�A�����A���[���A�h���X�����f���ꂽEmployee�I�u�W�F�N�g�̃��X�g���擾�ł���

		List<Employee> result = Employee.load(input);

		Employee employee2 = result.get(0);//��s�̃f�[�^�����������Ă���

		assertEquals("Ichiro", employee2.getFirstName(), "�G���[");
		assertEquals("Tanaka", employee2.getLastName(), "�G���[1");
		assertEquals("ichiro@example.com", employee2.getEmail(), "�G���[2");

	}
}
