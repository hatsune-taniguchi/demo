package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

	ItemStock itemStock = new ItemStock();
	Item item = new Item("syokiti", 0);

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

//������Ԃ�getNum��0���擾�ł���
	@Test
	void test1() {
		int result = itemStock.getNum(item);
		assertEquals(0, result, "test1()�G���[");
		// System.out.println(result);
	}

//������Ԃ�add��Item��ǉ������getNum��1���擾�ł���
	@Test
	void test2() {
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(1, result,"test2()�G���[");
	//	System.out.println(result);
	}

	// Item����ǉ�����Ă����Ԃ�getNum��1���擾�ł���
	@Test
	void test3() {
		item.setName("book");
		item.setPrice(500);
		itemStock.add(item);

		int result = itemStock.getNum(item);
		assertEquals(1, result, "test3()�G���[");
//		System.out.println(result);
	}

	// item����ǉ�����Ă����Ԃ�,add�œ���Item�I�u�W�F�N�g��ǉ������getNum��2���擾�ł���
	@Test
	void test4() {
		

		item.setName("book");
		item.setPrice(500);
		itemStock.add(item);
		itemStock.add(item);

		int result = itemStock.getNum(item);
		assertEquals(2, result, "test4()�G���[");
//		System.out.println(result);
	}

	@Test
	void test5() {
		
		Item item2 = new Item("CD", 1000);

		item.setName("book");
		item.setPrice(500);
		itemStock.add(item);
		
		itemStock.add(item2);

		int result = itemStock.getNum(item2);
		assertEquals(1, result, "test5()�G���[");
	//	System.out.println(result);

	}

}
