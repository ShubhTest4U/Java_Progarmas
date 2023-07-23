package JavaLearning.PatternProgram;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		0
//		2 0
//		4 2 0
//		6 4 2 0
//		8 6 4 2 0
		
		for(int r=0; r<=8; r=r+2)
		{
			for(int j=r; j>=0; j=j-2)
			{
				System.out.print("\t" +j);
			}
			System.out.println();
		}
		

	}

}
//