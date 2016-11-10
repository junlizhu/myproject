import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		PrintStream out = System.out ;
		// TODO Auto-generated method stub
		Set<Integer> intset  = new HashSet<Integer>();
		Set<String> strint = new  HashSet<String>();
		Set<Integer> intset2 = new HashSet<Integer>();
		out.println("inset 添加元素前" + intset);
		out.println("intset.size()" + intset.size());
		intset.add(10);
		intset.add(11);
		intset.add(12);
		intset.add(13);
		out.println("inset 添加元素后" + intset);
		out.println("intset.size()" + intset.size());
		//out.println(intset.add(13));
		out.println("intset.toString() : " + intset.toString());
		
		intset.add(18);
		intset.add(15);
		intset.add(13);
		intset.add(10);
		out.println("inset 添加元素10后" + intset);
		out.println("intset.size()" + intset.size());
		out.println("for each Hashset start :" );
		//for (Integer xInteger : intset2) {
		for (Integer xInteger : intset) {
			out.println(xInteger);
		}
		out.println("for each Hashset end");
		
		out.println("intset.isEmpty(): " + intset.isEmpty() + "\n" + intset);
		//out.println(intset);
		out.println("intset.contains(intset): " + intset.contains(intset));
		
		intset.remove(10);
		out.println("intset: " + intset);
		
		intset.toArray();
		out.println("intset.toArray(): " + intset.toArray());

		
		
		


		
		
		
		
		
		
		
		
		
		
		
		/*Integer[] y = intset.toArray(new Integer[0]);
		 out.println("intset.toArray(new Integer[0]");
		 for (Integer a : y) {
			out.println(a); 
			}*/
	}
}
