package pattern_program;

public class T5 {

	public static void main(String[] args) {
		//1  *****
		//2  ****
		//3  ***
		//4  **
		//5  *
		//6  **
		//7  ***
		//8  ****
		//9  *****
		
		//row-9 col-5 star-5 
		
		int star=5;
		int space=0;
		for(int i=1;i<=9;i++)
		{
			
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		if (i<5) 
		{
			star--;
			
		} else 
		{
             star++;
		}
		
	}
	

	}
	}
