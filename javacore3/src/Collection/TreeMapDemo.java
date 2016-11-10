package Collection;

import java.io.PrintStream;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		TreeMap<Long, Integer> tMap = new TreeMap<Long, Integer>();
		TreeMap<Long, Integer> tMap2 = new TreeMap<Long, Integer>();
		out.println("tMap.size() : " + tMap.size());
		out.println("tMap : " + tMap);
		tMap.put(12L, 120);
		tMap.put(13L, 130);
		tMap.put(14L, 140);
		tMap.put(15L, 150);
		tMap.put(16L, 160);
		out.println("tMap.size() : " + tMap.size());
		out.println("tMap : " + tMap);

		tMap.get(15L);
		out.println("tMap : " + tMap);

		Set<Entry<Long, Integer>> treeMaps = tMap.entrySet();
		for (Entry<Long, Integer> entry : treeMaps) {
			out.println(entry);
		}

		tMap.put(13L, 130);
		out.println(tMap.put(13L, 130));

		tMap2 = (TreeMap<Long, Integer>) tMap.clone();
		out.println("\ntMap2 : " + tMap2);

		tMap.put(13L, 135);
		out.println("\ntMap : " + tMap);

		tMap.subMap(13L, 16L);
		out.println("\ntMap : " + tMap);

		boolean fromInclusive = true;
		boolean toInclusive = true;
		tMap.subMap(13L, fromInclusive, 16L, toInclusive);
		out.println("\ntMap : " + tMap);

		tMap.values();
		out.println("\ntMap.values() : " + tMap.values());

		tMap.pollFirstEntry();
		out.println("\ntMap : " + tMap);

		tMap.pollLastEntry();
		out.println("\ntMap : " + tMap);

		tMap.remove(13L);
		out.println("\ntMap : " + tMap);

		tMap.remove(14L, 140);
		out.println("\ntMap : " + tMap);

		tMap = (TreeMap<Long, Integer>) tMap2.clone();
		out.println("\ntMap : " + tMap);

	}

}
