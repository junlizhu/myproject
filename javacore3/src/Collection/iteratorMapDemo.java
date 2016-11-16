package Collection;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class iteratorMapDemo {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Map<Long, Integer> ap = new HashMap<Long, Integer>();
		out.println("tMap.size() : " + ap.size());
		out.println("tMap : " + ap);
		ap.put(12L, 120);
		ap.put(13L, 130);
		ap.put(14L, 140);
		ap.put(15L, 150);
		ap.put(16L, 160);
		out.println("tMap.size() : " + ap.size());
		out.println("tMap : " + ap);
		out.println("-----------------------------------");
		
		Set<Map.Entry<Long,Integer>> a = ap.entrySet();
		//iterat
	}

}
