package JavaLearning;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Shubham";
		String t ="";

		for(int i = s.length()-1; i>=0; i--)
		{
			t= t + s.charAt(i);
			//System.out.println(s.charAt(i));
		}

		System.out.println(t);

		if(s.equals(t))
		{
			System.out.println("It's palindrome.");
		}
		else
		{
			System.out.println("It's not palindrome");
		}

	}

}
