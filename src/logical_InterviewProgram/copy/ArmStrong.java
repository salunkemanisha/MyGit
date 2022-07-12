package logical_InterviewProgram.copy;

public class ArmStrong {

	public static void main(String[] args) {
       //ArmStrong 153=1*1*1 + 5*5*5 + 3*3*3 = 153
		
		int no=153;
		int no1=0;
		for(int i=no;i>0;i=i/10)    //i=153  153/10=15 15/10=1
		{
			int remainder=i%10;    //remainder=3 ,5  ,1
			 no1=no1+(remainder*remainder*remainder); //no1=0+3*3*3= 27  no1=27+5*5*5 =152  no1=152+1*1*
			 //no1=0, 27  152 153
			
		}
		if (no==no1) 
		{
			System.out.println("armstrong no");
		}
		else 
		{
          System.out.println("NOT armstrong no");
		}
	}

}
