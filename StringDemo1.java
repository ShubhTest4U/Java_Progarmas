package JavaLearning;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hello";   //1st way > String Literal
		String b= "Hello";

		//String b object will be not created in memory cause it has same value and it'll point out string a value(Object)

		String aa = new String("Hello"); //2nd way > By creating object of string
		String bb = new String("Hello"); //String class creates every time new objects in memory

		/*Difference between both type of string is that in string literal same object will be not created and
		2nd string type same object will define in memory and object will be created.*/

		a.concat("world");   //String is immutable

		System.out.println("String a value is: "+a);
		System.out.println("String b value is: "+b);
		System.out.println("String aa value is: "+aa);
		System.out.println("String bb value is: "+bb);

		System.out.println("**********************************");

		System.out.println(a.equals(b)); //true
		System.out.println(a==b); //true
		System.out.println(a==aa); //fail matching the references ==
		System.out.println(aa==bb); //fail references are different as they are defined with string class

		//StringBuffer and StringBuilder : Mutable

		StringBuffer sb = new StringBuffer("String Buffer");
		sb.append(" Append");
		System.out.println("Append value is: " +sb);
		sb.insert(2, "r");
		System.out.println("Insert value is: " +sb);
		sb.replace(2, 4, "r");
		System.out.println("Replace value is: " +sb);
		sb.delete(14, 20);
		System.out.println("Delete value is: " +sb);
		sb.reverse();
		System.out.println("Reverse vale is: "+sb);

		//String builder is not thread safe and not synchronize. it's fast.


	}

}
