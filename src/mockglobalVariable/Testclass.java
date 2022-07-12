package mockglobalVariable;

public class Testclass {
	 static int a=10;
	 final int b=20;

	public static void main(String[] args) {
		Testclass tc=new Testclass();
		tc.add();
		System.out.println(a);
     
	}
	public void add() {
		a=a+10;
		//b=b+10;
		System.out.println("value "+a);
		
	}
	

}
