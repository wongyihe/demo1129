package demo1129;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		String key1 = "leon";
		String key2 = "godleon";
		map.put(key1, "leon 的資料");
	  	map.put(key2, "godleon 的資料");
		System.out.println(map.get(key1));
		System.out.println(map.get(key2));
	}

}
