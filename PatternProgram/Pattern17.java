package JavaLearning.PatternProgram;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		0
//		1 0
//		1 0 1
//		0 1 0 1
//		0 1 0 1 0
		
		int x=1;
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=r; c++)
			{
				if(x%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
				x++;
				
			}
			System.out.println();
			
		}
		
	}

}
