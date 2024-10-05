package basicPrograms;

public class progm18 {
	public static void main(String[] args) {
		string_method();
	}

	public static void string_method() {
		String s = "GeeksforGeeks";
		System.out.println("String length " + s.length()); // length of the string
		System.out.println("Character at 4th postion " + s.charAt(4));// char index
		System.out.println("Substring " + s.substring(5)); // return substring from the ith index
		System.out.println("substring " + s.substring(4, 8));// return substring from i to j-1 index
		// string concatenation
		String s1 = "Geeks";
		String s2 = "forGeeks";
		System.out.println("Concatenated string = " + s1.concat(s2));
		//Return the index within the string
		
		String s4 = "Lion is a wild animal";
		System.out.println("Index of share "+s4.indexOf("a")); // Index of share 
		System.out.println("Index of a = "+ s4.indexOf('a', 9));
		
		Boolean out = "Geeks".equals("geeks");
		System.out.println("Checking Equality "+ out);
		Boolean out1 = "Geeks".equalsIgnoreCase("gEekS");
		System.out.println("Ingnoring the cases "+out1); // Ignorance of cases
		
		String man = "A MAN WENT TO A JUNGLE TO A ANIMALS";
		try {
			System.out.println("converting into lowercases "+man.toLowerCase());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Get a message from the exception "+e.getMessage());
		}
		String cat = "I am coming from past 2 months";
		System.out.println(""+cat.toUpperCase());
		// Trimming the word
		
		String word1 = "Learn unlearn Relearn ";
		System.out.println("Trim the word "+word1.trim());
		
		// Replacing characters
		
		String str1 = "feeksforfeeks";
		System.out.println("Originals string "+str1);
		String str2 = "feeksforfeeks".replace('f', 'g');
		System.out.println(str2);
		
		
		

	}


}
