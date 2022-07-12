package pattern_program;

public class Trangal1_left {

	public static void main(String[] args) {
      //    *
	  //   **
	  //  ***
	  // ****
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)   // i=1 i=2 i=3 i=4
		{
           for(int j=1;j<=space;j++) //j=1<=3  j=2<=3 j=3<=3 j=4<=3 condition not match
			{
				System.out.print(" ");  //printspace " ", " "," " not print " "
			}
           for(int j=1;j<=star;j++) //after that print star *
           {
        	   System.out.print("*");
           }
           
			System.out.println();
			star++;  // star =1 ,2,3,4
			space--;   //space =3 2 1 0
		}
	}
	

}
