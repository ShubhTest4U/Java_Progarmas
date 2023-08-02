package JavaLearning.PatternProgram;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		50
//		40	41
//		30	31	32
//		20	21	22	23
//		10	11	12	13	14


		
		int rx=50; 
		int cx;
		for(int r=1; r<=5; r++)
		{
			cx=rx;
			for(int c=1; c<=r; c++)
			{
				System.out.print("\t" +cx);
				cx++;
			}
			System.out.println();
			rx=rx-10;
		}

	}

}
