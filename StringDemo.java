package JavaLearning;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = " JavaLearning";
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("e"));
		System.out.println(a.substring(4));
		System.out.println(a.substring(3, 6));
		System.out.println(a.concat(" By Shubh"));
		System.out.println(a.trim());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.replace("n", "b"));
	}

}
