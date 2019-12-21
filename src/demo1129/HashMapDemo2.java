package demo1129;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapDemo2 {

public static void main(String[] args) {

Map<String, String> map = new HashMap<String, String>();
    map.put("leon", "leon 的資料");
    map.put("godleon", "godleon 的資料");
   map.put("bill", "bill 的資料");
//   // 最後由 Iterator 列出所有元素
//   Collection collection = map.values();
//   Iterator iterator =  collection.iterator();
//   while(iterator.hasNext())
//               System.out.println(iterator.next());
//     System.out.println();
    for(String s : map.values())
                  System.out.println(s);
      System.out.println();

}}