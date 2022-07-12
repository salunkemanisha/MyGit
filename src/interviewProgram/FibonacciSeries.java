package interviewProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
    
		int a=0,b=1,sum=0;
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		for(int i=0;i<=10;i++)
		{
			sum=a+b;//0+1,1+1 1+2 2+3 3+5 5+8....
		    System.out.println(" "+sum);//1 2 3 5 8 13......
		    a=b; //a=1, a=2 a=3 a=5 a=8.....
		    b=sum; //b=1,b=2 b=3 b=5 b=8 b=13.....
		 }
	}

}
