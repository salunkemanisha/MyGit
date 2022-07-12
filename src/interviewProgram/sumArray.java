package interviewProgram;

import java.util.Arrays;

public class sumArray {

	public static void main(String[] args) {
 int a[]= {1,4,5,6};
 int b=0;
 
 for(int i=0;i<=a.length-1;i++)  // i=0 i=1 i=2 i=3 i++=4
 {
		 b=b+a[i]; //0+1 ,b=1 ,+4 b=5 ,+5 b=10 ,+6 b=16
	 }
      System.out.println("sum  of "+b);
      
      
      int c[]= {1,2,3};
      int d[]= {2,4,6};
      int sum[]=new int[3];
      
      for(int i=0;i<=c.length-1;i++) {
    	  for (int j=0;j<=d.length-1;j++) {
    		  sum[i]=c[i]+d[j];
    		  System.out.println(Arrays.toString(sum));
    	  }
    	 // System.out.println();
      }

 }
	}


