package JavaLearning.PatternProgram;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1
//		2 3
//		4 5 6
//		7 8 9 10
//		11 12 13 14 15
		
		int x=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("\t" + x );
				x++;
			}
			System.out.println();
		}
		
//		15 14 13 12 11
//		10 9 8 7 
//		6 5 4
//		3 2
//		1
		
//		for(int i=15; i>=1; i--)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print("\t" +x);
//				x--;
//			}
//			System.out.println();
//		}
//		
		
	}

}
