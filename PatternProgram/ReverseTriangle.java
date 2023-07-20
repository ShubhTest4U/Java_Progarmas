package JavaLearning.PatternProgram;

public class ReverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	*****
//	****
//	***
//	**
//	*
		for(int r=5; r>=1; r--)
		{
			for(int c=0; c<=r-1; c++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
