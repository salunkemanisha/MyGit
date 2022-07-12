package interviewProgram;

public class ArmStrong_ex {
	int num =152;
    int cub=0;
    int temp=num;
    int a;
    public void armStrong1() 
    {
     while(num>0)
     {
    	 a=num%10;
         num=num/10;
         cub=cub+(a*a*a);
         
     }
     if(temp==cub)
		{
			System.out.println("Given number " +temp+" is ArmStrong Number");
		}
		else {
			System.out.println("Given number " +temp+" is not ArmStrong Number");
		}

		
			
	}

	public static void main(String[] args) {
		ArmStrong_ex a=new ArmStrong_ex();
		a.armStrong1();
     
	}

}
