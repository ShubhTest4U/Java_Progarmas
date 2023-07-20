package JavaLearning.PatternProgram;

public class Pattern123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1
//		12
//		123
//		1234
		
		
		for(int r=1; r<=4; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(c);
			}
			System.out.println("");
		}
	}
}
