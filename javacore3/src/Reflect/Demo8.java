package Reflect;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class Demo8 {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Class<?> demo = null;
		try {
			 demo = Class.forName("Reflect.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	    out.println("*****本地属性*******");
	
	    out.println("获得本类的全部属性");
	    Field[] field1 = demo.getDeclaredFields();
	    for (int i = 0; i < field1.length; i++) {
	    	int mo = field1[i].getModifiers();
	    	String priv = Modifier.toString(mo);
	    	Class<?> type = field1[i].getType();
	    	out.println(priv + "" + type.getName() + "" + field1[i].getName() + ";");
			
		}
	    out.println("**************实现接口或者父类的属性*****************");
	    
	    Field[] field2 = demo.getFields();
	    for (int j = 0; j < field2.length; j++) {
			int mo = field2[j].getModifiers();
			String priv = Modifier.toString(mo);
			Class<?> type = field2[j].getType();
	    	out.println(priv + "" + type.getName() + "" + field2[j].getName() + ";");
			
		}
	}

}
