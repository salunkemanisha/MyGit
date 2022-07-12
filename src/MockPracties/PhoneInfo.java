package MockPracties;

public class PhoneInfo {

	public static void main(String[] args)
	{
		 display();
		 PhoneInfo phi=new PhoneInfo();
         phi.MobileInfo("realme 7i", 24, 4.5f, 19, 'B');
         System.out.println("-------------------------");
         phi.MobileInfo("oppo A55", 64, 6.2f, 13, 'A');
		
 
	}
	public static void display() {
		System.out.println("All mobaile information");
		System.out.println("=======================");
		
		
	}
	public void MobileInfo(String Mname,int INmemory,float Dsize,int camera,char Rgrade )
	{
		System.out.println("Mobaile name is :"+Mname);
		System.out.println("Internal Memory :"+INmemory+"GB");
		System.out.println("Display Size :"+Dsize+"inch");
		System.out.println("Camera :"+camera+"MP");
		System.out.println("Rating in Grade :"+Rgrade);
	}

}
