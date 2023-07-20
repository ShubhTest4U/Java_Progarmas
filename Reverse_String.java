package JavaLearning;

public class Reverse_String {

	public static void main(String[] args) {
		
		// Method 1: Using string concatenation operator
		
		// Initialize the string and a new empty string to store the reversed string
//		String str = "Shubham";
//		String rev = "";
//		
//		// Get the length of the string
//		int len = str.length();
//		
//		// Iterate over the characters in the string in reverse order
//		for(int i=len-1;i>=0;i--)
//		{
//			// Append each character to the reversed string
//			rev=rev+str.charAt(i);
//		}
//		
//		// Print the reversed string to the console
//		System.out.println("Reverse String is:"+ rev);
//		
//		// Method 2: Using Char Array
//		
//		// Initialize the string and a new empty string to store the reversed string
//		String str = "Shubham";
//		String rev = "";
//		
//		// Convert the string to a char array
//		char a[] = str.toCharArray();
//		
//		// Get the length of the char array
//		int len = a.length;
//		
//		// Iterate over the characters in the char array in reverse order
//		for(int i=len-1;i>=0;i--)
//		{
//			// Append each character to the reversed string
//			rev=rev+a[i];
//		}
//		
//		// Print the reversed string to the console
//		System.out.println("Reverse string is :"+ rev);
		
		// Method 3: Using string buffer class
		
		// Initialize the string and a new empty string to store the reversed string
		String str = "Shubham";
		String rev = "";
		
		// Create a StringBuffer object with the original string as an argument to the constructor
		StringBuffer sb = new StringBuffer(str);
		
		// Reverse the StringBuffer object
		sb.reverse();
		
		// Print the reversed string to the console
		System.out.println("Reverse string is = " +sb);
		
	}

}
