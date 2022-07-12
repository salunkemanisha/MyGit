package interviewProgram;

public class ArmStrong_Number {

	public static void main(String[] args) {
      
		//ArmStrong_number
	   //suposs 153 ---> 1*1*1 + 5*5*5 + 3**3*3  ---> 1+125+27 == 153
		
		int a=153;
		int b=0;
		for(int i=a;i>0;i=i/10)
		{
			System.out.println(i);
			
			System.out.println(i/10);//3, 5, 1
            int reminder=i%10;
			b=b+(reminder*reminder*reminder);
		}
		
		if(b==a)
		{
			System.out.println("Given number " +a+" is ArmStrong Number");
		}
		else {
			System.out.println("Given number " +a+" is not ArmStrong Number");
		}

		
			
		
	}

}
