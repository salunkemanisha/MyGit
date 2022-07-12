package interviewProgram;

public class duplicateArray {

	public static void main(String[] args) {
		
      String s[]= {"ram","sham","gita","sham","ram"};
      for (int i=0; i<=s.length-1;i++) {
    	  for(int j=i+1;j<=s.length-1;j++) {
    		  if(s[i].equals(s[j])) // Or if(s[i]==s[j])
    			  {
    			  System.out.println(s[i]);
    		  }
    	  }
      }
      
      // number duplicate
      int a[]= {1,3,5,6,7,4,3,5};
      
      for(int k=0;k<=a.length-1;k++) {
    	  for(int l=k+1;l<=a.length-1;l++) {
    		  if(a[k]==a[l]) {
    			  System.out.println(a[k]);
    		  
      }}
      }
      
      
	}

}
