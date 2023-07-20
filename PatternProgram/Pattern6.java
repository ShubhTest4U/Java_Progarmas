package JavaLearning.PatternProgram;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1
//		1  10 
//		1  10  100
//		1  10  100  1000
//		1  10  100  1000  10000
		
//		for(int r=1; r<=10000; r=r*10)
//		{
//			for(int c=1; c<=r; c=c*10)
//			{
//				System.out.print("\t"+c);
//			}
//			System.out.println();
//		}

//		10000 1000 100 10 1
//		10000 1000 100 10 
//		10000 1000 100 
//		10000 1000
//		10000

		for(int r=10000; r>=1; r=r/10)
		{
			for(int c=1; c<=r; c=c*10)
			{
				System.out.print("\t"+c);
			}
			System.out.println();
		}
	}
	

}
