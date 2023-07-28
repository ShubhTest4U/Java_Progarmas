package JavaLearning.PatternProgram;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		1
//		3 5
//		7 9 11
//		13 15 17 19
//		21 23 25 27 29

		int x=1;
		for(int r=1; r<=5; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print("\t"+x);
				x=x+2;
			}
			System.out.println();
		}
	}
	}
