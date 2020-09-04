
public class StringConceptInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Focus on";
		String text1 = "  Practice on";
		
		//System.out.println(System.identityHashCode("Focus on"));
		//System.out.println(System.identityHashCode("Focus on"));
		
		
		//String text = new String ("String Concept");
		//String text1 = new String ("String Concept");
		
		//System.out.println(System.identityHashCode("String Concept"));
		//System.out.println(System.identityHashCode("String Concept"));
		
		//1. Equal return true or false
		
		System.out.println(text.equals(text1));
		
		
		//2. Length () - return count of String
		String text2 = "New Learning String";
		
		System.out.println(text2.length());
		
		//3. Concat() - To Concat (join more than one String)
		
		String lastName = "Choudhury";
		String firstName = "Touhid ";
		String middleName = "Akbar ";
		
		//String fullName = firstName+" "+middleName+" "+lastName;
	
				
		//System.out.println(fullName);
		
		System.out.println(firstName+" "+middleName+" "+lastName);
		
		// To concat different data type variable
		
		String num = "20 ";
		String myName = "Touhid";
		
		int a = 10;
		int b = 20;
		
		System.out.println(num+myName);
		System.out.println(num + a);
		
		System.out.println(a+b);
		
		//4. Trim- To remove white space from both side of a string
		
		String line = "   Java String Concept  ";
		System.out.println(line);
		System.out.println(line.length());
		System.out.println(line.trim());
		System.out.println(line.trim().length());
		
		
		//5.Substring- Return partial string (string word only. For example, begning from the 8th index
		
		String text3 = "My Name is Touhid Akbar Choudhury";
		System.out.println(text3.substring(11));
		System.out.println(text3.substring(0,8));
		
		
	}

}