package JavaLearning.PatternProgram;

public class Pattern9 {
	
	public static void main(String[] args) 
	{
//		1
//		10
//		101
//		1010
//		10101
		
//		for(int r=1; r<=5; r++)
//		{
//			for(int c=1; c<=r; c++)
//			{
//				if(c%2==0)
//				{
//					System.out.print("0");
//				}
//				else
//				{
//					System.out.print("1");
//				}
//			}
//			System.out.println();
//		}
		
 
		
		for(int r=5; r>=1; r--)
		{
			for(int c=1; c<=r; c++)
			{
				if(c%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println();
			
		}
		
		
		
	}

}
