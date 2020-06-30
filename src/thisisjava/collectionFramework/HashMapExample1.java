package thisisjava.collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("노정탁", 85);
		map.put("진민종", 95);
		map.put("장정필", 100);
		map.put("박민철", 90);
		
		System.out.println("총 entry 수 : " + map.size());
		
		System.out.println("\t노정탁 : " + map.get("노정탁") + "\r\n");
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		
		while ( iterator.hasNext() ) {
			
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value );
		}
		
		map.remove("노정탁");
	
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while ( entryIterator.hasNext() ) {
			
			Map.Entry<String, Integer> entry = entryIterator.next();
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("\t" + key + " : " + value);
		}
		
		map.clear();
		
		System.out.println("총 entry 수 : " + map.size());
	}
}
