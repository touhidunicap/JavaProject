package learnJava;

import java.util.ArrayList;
import java.util.List;

public class Collection_ListArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a object of Array List
		//List<string> names = new ArrayList<string>();
		
		List<String> names = new ArrayList<String>();
		
		//1. Add items in List- use add()
		names.add("Sumon");
		names.add("Babul");
		names.add("Faruk");
		names.add("Belal");
		names.add("Habib");
		names.add("Firuz");
		names.add("Pollob");
		names.add("Sumon");
		names.add("Bipul");
		names.add("Mishu");
		
		System.out.println(names);
		
		
		//2. Count of List- use size()
		//System.out.println(names.size());
		
		//3. Pick particular item from the List- use get(item)
		//System.out.println(names.get(4));
		
		//4. After adding item- size of list
		names.add("Shofiq");
		//System.out.println(names.size());
		
		//5. Print all item from list- use for loop
		/*for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
			//System.out.println(names.size());
			
			}*/
		
		// 6. Delete item from list- use remove()
		//System.out.println(names.remove("Mishu"));
		/*for (int i = 0; i < names.size(); i++) {
		System.out.println(names.get(i));

		}*/
		
		//7. Verifying particular item from the list- use contains(item); result- true/false
		
		System.out.println(names.contains("Pollob"));
		
		//8. Remove all the items from the list- use clear()
		names.clear();
		
		//9. Confirmation if the list is empty or not- use isEmpty()
		System.out.println(names.isEmpty());
		
		

	}

}
