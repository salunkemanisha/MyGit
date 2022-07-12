package interviewProgram;

public class ArrayNumReversc {

	public static void main(String[] args) {
		//revers number
		int num[]= {1,2,3,4,5};
//		num[0]=1;
//		num[1]=2;
//		num[2]=3;
//		num[3]=4;
//		num[4]=5;
		for(int n=num.length-1;n>=0;n--) {
			System.out.println(num[n]);
		}
		
		//negative num
		System.out.println("================"); 
		int e[]= {-1,-2,-3}; //use negative number also
		
		//int g[]=new int[-2];
		//System.out.println(g[1]); // cant pass negetive size of array run time exeption
		
		
		
		
	}

}
