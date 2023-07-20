package JavaLearning.PatternProgram;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		0
//		0	2
//		0	2	4
//		0	2	4	6
//		0	2	4	6	8
//		0	2	4	6	8	10
		
//		for(int r=0; r<=10; r=r+2)
//		{
//			for(int c=0; c<=r; c=c+2)
//			{
//				System.out.print("\t"+c);
//			}
//			System.out.println();
//		}
//		1
//		1	2
//		1	2	3
//		1	2	3	4
//		1	2	3	4	5
//		1	2	3	4	5	6
//		1	2	3	4	5	6	7
//		1	2	3	4	5	6	7	8
//		1	2	3	4	5	6	7	8	9
	
//		for(int r=1; r<=9; r++)
//		{
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print("\t"+c);
//			}
//			System.out.println();
//		}
//		
//		12345678
//		123456
//		1234
//		12
		
		for(int r=8; r>=1; r=r-2)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(c);
			}
			System.out.println();
		}

	}
}
