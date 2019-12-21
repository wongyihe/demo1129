package demo1129;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("輸入名稱(使用 quit 結束：)");
		while(true) {
			System.out.print("# ");
			String input = scanner.next();
			if(input.equals("quit")) break;
			list.add(input);
		}
		System.out.println("顯示輸入：");
		for(int i = 0 ; i < list.size() ; i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		for(String s : list)
			System.out.print(s + " ");
		System.out.println();
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
	}

}
