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

//初期状態でgetNumで0が取得できる
	@Test
	void test1() {
		int result = itemStock.getNum(item);
		assertEquals(0, result, "test1()エラー");
		// System.out.println(result);
	}

//初期状態でaddがItemを追加するとgetNumで1が取得できる
	@Test
	void test2() {
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(1, result,"test2()エラー");
	//	System.out.println(result);
	}

	// Itemが一つ追加されている状態でgetNumで1が取得できる
	@Test
	void test3() {
		item.setName("book");
		item.setPrice(500);
		itemStock.add(item);

		int result = itemStock.getNum(item);
		assertEquals(1, result, "test3()エラー");
//		System.out.println(result);
	}

	// itemが一つ追加されている状態で,addで同じItemオブジェクトを追加するとgetNumで2が取得できる
	@Test
	void test4() {
		

		item.setName("book");
		item.setPrice(500);
		itemStock.add(item);
		itemStock.add(item);

		int result = itemStock.getNum(item);
		assertEquals(2, result, "test4()エラー");
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
		assertEquals(1, result, "test5()エラー");
	//	System.out.println(result);

	}

}
