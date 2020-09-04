package learnJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		mp.put("Touhid", 123);
		mp.put("Mamun", 456);
		mp.put("Ashraf", 789);
		mp.put("Kamran", 159);
		mp.put("Jamil", 357);
		mp.put("Babul", 147);
		mp.put("Affan", 123);
		//mp.put("Touhid", 987);
		
		for (Entry<String, Integer> eachmp : mp.entrySet()) {
			
			System.out.println(eachmp.getKey()+"   "+eachmp.getValue());
		}
		
		//mp.size
		mp.size();
		System.out.println(mp.size());
		
		
		//mp.remove
		mp.remove("Touhid");
		
		System.out.println(mp.size());
		
		//mp.get
		System.out.println(mp.get("Jamil"));
		
		//contain(key)- true/false
		System.out.println(mp.containsKey("Kamran"));
		
		//contain(value)- true/false
		System.out.println(mp.containsValue(943));
		
		//clear()- remove all map data
		mp.clear();
		
		//isEmpty ()- confirmation of clear
		System.out.println(mp.isEmpty());
		
		
		
		
		
		
		
		

	}

}
