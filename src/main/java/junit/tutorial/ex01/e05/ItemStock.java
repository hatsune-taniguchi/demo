package junit.tutorial.ex01.e05;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {
	private Map<String, Integer> itemMap = new HashMap<>();
	
	//指定したItemオブジェクトの数量を返すメソッド
	public int getNum(Item item) {
		Integer num = itemMap.get(item.getName());
		if (num == null) {
			return 0;
		} else {
			return num;
		}
	}
	//商品を追加するメソッド
	public void add(Item item) {
		Integer num = itemMap.get(item.getName());
		if (num == null) {
			num = 0;
		}
		num++;
		itemMap.put(item.getName(), num);
	}

}
