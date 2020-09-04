package learnJava;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PracticeTMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, Integer> emp = new TreeMap<String, Integer>();
		
		emp.put("Karim", 10000);
		emp.put("Rahim", 15000);
		emp.put("Shabul", 15000);
		emp.put("Asad", 35000);
		emp.put("Touhid", 150000);
		emp.put("Rita", 100000);
		
		for (Entry<String, Integer> eachemp : emp.entrySet()) {
			
			System.out.println(eachemp.getKey()+"    "+eachemp.getValue());
		}
		
		
		emp.size();
		
		System.out.println(emp.size());
		
		emp.remove("Karim");
		
		System.out.println(emp.size());
		
		emp.replace("Rahim", 25000);
		
		for (Entry<String, Integer> eachemp : emp.entrySet()) {
			
			System.out.println(eachemp.getKey()+"   "+eachemp.getValue());
			
		}
		
		
	}

}
