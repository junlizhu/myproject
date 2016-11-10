package javacore3.collection;

import java.io.PrintStream;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		List<String> strlist = new ArrayList<String>();
		List<String> strlist2 = new ArrayList<String>();
		List<Integer> intlist = new ArrayList<Integer>();
		
		
		strlist2.add("wo");
		strlist2.add("ai");
		strlist2.add("zhong");
		strlist2.add("guo");
		
		strlist.size();
		out.println("未添加元素时的长度: " + strlist.size());
		strlist.add("I");
		strlist.add("Love");
		strlist.add("China");
		out.println("strlist: " + strlist);
		strlist.size();
		out.println("添加元素后的长度: " + strlist.size());
		
		strlist.get(1);
		out.println("strlist.get(1): " +strlist.get(1));
		
		strlist.remove(2);
		out.println("strlist.toString(): " +strlist.toString());
		
		strlist.addAll(strlist2);
		out.println("strlist.addAll(strlist2): " + strlist.addAll(strlist2));
		out.println("strlist.toString(): " +strlist.toString());

		strlist.retainAll(strlist2);
		out.println("strlist.toString(): " +strlist2.toString());

		strlist.isEmpty();
		out.println("strlist.isEmpty(): " +strlist.isEmpty());
		out.println("strlist.toString(): " +strlist.toString());

		strlist.subList(0, 5);
		out.println("strlist.subList(0, 5): " +strlist.subList(0, 5));
		out.println("strlist.subList(0, 5).toString(): " +strlist.subList(0, 5).toString());

		Iterator<String> iterator = strlist.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			out.println(object);
			
		}
	}

}
