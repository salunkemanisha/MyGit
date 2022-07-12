package MockPracties;

public class ConstructorStudy {
    int a;
    int b;
    public ConstructorStudy(int x,int z)
    {
    	a=x;
    	b=z;
    }
    
	public static void main(String[] args) {
		ConstructorStudy cs=new ConstructorStudy(50, 10);
		cs.addition();
		cs.subtraction();
		cs.multiplication();
		cs.Division();
 
	}
	public void addition() {
		int sum=a+b;
		System.out.println("Addtion is :"+sum);
		
	}
	public void subtraction() {
		int sub=a-b;
		System.out.println("Subtraction is :"+sub);
		}
	public void multiplication() {
		int mul=a*b;
		System.out.println("multiplication is :"+mul);
	}
	public void Division() {
		float div=a/b;
		System.out.println("division is :"+div);
		
	}

}
