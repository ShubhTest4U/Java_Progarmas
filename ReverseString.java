package JavaLearning;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Shubham";
		
		for(int i=a.length()-1; i>=0; i--)
		{
			System.out.println(a.charAt(i));
		}
		
		StringBuffer s = new StringBuffer("Hello World");
		s.reverse();
		System.out.println("Reverse string is :"+s);

	}

}
