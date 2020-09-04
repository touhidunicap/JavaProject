package learnJava;

import java.util.HashSet;
import java.util.Set;

public class Collection_SetArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set<Integer> obj = new HashSet<Integer>();
		Set<Integer> num = new HashSet<Integer>();
		
		//1. Add items -use add()
		num.add(123);
		num.add(456);
		num.add(789);
		num.add(147);
		num.add(852);
		num.add(963);
		num.add(147);
		num.add(258);
		num.add(369);
		num.add(753);
		num.add(159);
		
		//2. Get count of set- use size();
		
		//System.out.println(num.size());
		
		//3. Print/Display all items of Set- use foreach
		
		/*for (Integer eachNum : num) {
		System.out.println(eachNum);
		
			
		}*/

		//4. Delet item from Set -use remove)
		/*System.out.println(num.remove(123));
		
		for (Integer eachNum : num) {
		System.out.println(eachNum);
		}*/
		
		//5. Verifying particular item from the Set- use contains (item); result- true/false
		
		System.out.println(num.contains(159));
		
		
		//6. Remove all items from the Set- use clear();
		num.clear();
		
		//7. Confirm Set is empty or not- use isEmpty();
		System.out.println(num.isEmpty());
		
		
		}
	
		// Remove all items from the Set- use clear();
	
		
		
		

}
