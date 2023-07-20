package JavaLearning.PatternProgram;

public class Pattern3 {

	public static void main(String[] args) {
		
//		1234
//		123
//		12
//		1
		
//		for(int r=4; r>=1; r--)
//		{
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print(c);
//			}
//			System.out.println("");
//		}
		
//		1
//		1	3
//		1	3	5
//		1	3	5	7
//		1	3	5	7	9
		
//		for(int r=1; r<=9; r=r+2)
//		{
//			for(int c=1; c<=r; c=c+2 )
//			{
//				System.out.print("\t"+c);
//			}
//			System.out.println("");
//		}

//		1	3	5	7	9
//		1	3	5	7
//		1	3	5
//		1	3
//		1
		
//		for(int r=9; r>=1; r= r-2)
//		{
//			for(int c=1; c<=r; c=c+2)
//			{
//				System.out.print("\t" +c);
//			}
//			System.out.println("");
//		}

//		5	4	3	2	1
//		5	4	3	2
//		5	4	3
//		5	4
//		5
		
		for(int r=1; r<=5; r++)
		{
			for(int c=5; c>=r; c--)
			{
				System.out.print("\t"+c);
			}
			System.out.println("");
		}
		

	}

}
