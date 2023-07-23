package JavaLearning.PatternProgram;

public class Pattern2 {

//https://www.youtube.com/watch?v=bmlS5-EHfj4&list=PLZiHmCL7g2Ch1WQMJQu0AYNoKzAzXjOro&index=30&ab_channel=ICSEComputerPrateikSharma


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1
//		22
//		333
//		4444

//		for(int i=1; i<=4; i++)
//		{
//			for(int j=1; j<=i; j++)
//			{
//				System.out.print(i);
//			}
//			System.out.println("");
//		}

//		4444
//		333
//		22
//		1

		for(int r=4; r>=1; r--)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(r);
			}
			System.out.println();
		}

	}

}
