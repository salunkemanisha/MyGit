package pattern_program;

public class ZpatternProg {

	public static void main(String[] args) {
    // * * * *
	//	   *
	//   *
	// * * * *	
	// row-4 col 4 star-4 space-0	
		int star=4;
		int space=2;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++ )
			{
				if(i==1&&i==4 ) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
	}

}
