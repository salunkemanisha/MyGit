package pattern_program;

import java.util.Iterator;

public class StarProgram1Square {
	
	public static void main(String[] args) {
		
		// * * * *
		// * * * *
		// * * * *
		// * * * *
		
		for(int i=1;i<=4;i++) //row
		{
			for(int j=1;j<=4;j++) //column
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
