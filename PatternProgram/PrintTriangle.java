package JavaLearning.PatternProgram;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	*
//	**
//	***
//	****
//	*****
		
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	

	}

}
