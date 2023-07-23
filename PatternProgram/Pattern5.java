package JavaLearning.PatternProgram;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1
//	333
//	55555
//	7777777

//		for(int r=1; r<=7; r=r+2)
//		{
//			for(int c=1; c<=r; c++)
//			{
//				System.out.print(r);
//			}
//
//			System.out.println();
//		}

//		666666
//		4444
//		22
//		0

		for(int r=6; r>=0; r=r-2)
		{
			for(int c=0; c<=r; c++)
			{
				System.out.print(r);
			}
			System.out.println();
		}

	}

}
