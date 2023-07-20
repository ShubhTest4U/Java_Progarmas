package JavaLearning;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String is an object of characters
		//String Literal
		
		String S1 = "Hello";
		String S2 = "Hello";
		
		String S3 = new String("Welcome");
		String S4 = new String("Welcome");
		
		String S = "Automation Tester Soon";
		String[] splittedString = S.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		//Print reverse string value
		
		for(int i=S.length()-1; i>=0; i--)
		{
			System.out.println(S.charAt(i));
			
		}
	}

}
