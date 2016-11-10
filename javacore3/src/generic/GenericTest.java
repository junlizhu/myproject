package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		
    List<String> name = new ArrayList<String>();
    List<Integer> age = new ArrayList<Integer>();
    List<Number> number = new ArrayList<Number>();
    
    name.add("谢少锋");
    age.add(26);
    number.add(156);
    
    get(name);
    get(age);
    get(number);
    
   // getUpernumber(name);
    getUpernumber(age);
    getUpernumber(number);
	
	}
	
	public static void get(List<?> x){
		//System.out.println("data :" + x.get(0));
	}
  public static void getUpernumber(List<? extends Number > x) {
	  System.out.println("data :" + x.get(0));
  }

}


