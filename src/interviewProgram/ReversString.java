package interviewProgram;

public class ReversString {

	public static void main(String[] args) {
     String name="manisha";
     char[] r=name.toCharArray();
     for(int i=r.length-1; i>=0;i--) {
    	 System.out.print(r[i]);
     }
	System.out.println();
	System.out.println("+++++++");
	
	
    //char[] name1={'s','a','l','u','n','k','e'};
	//char[] n=name1;

	String name1="manisha";
	for(int j=name1.length()-1;j>=0;j--) 
	{
		System.out.print(name1.charAt(j));
	
	}
	System.out.println("========================");
	
	
	}

}
