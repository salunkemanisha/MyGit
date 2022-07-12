package interviewProgram;

public class CountOccurencesString {

	public static void main(String[] args) {

		String name="manisha salunke";
		int T_count=name.length();//total length
		
		int T_countAfterRemove = name.replace("a", "").length();//total length after removing a
		
		int countOccure = T_count-T_countAfterRemove;
		
		System.out.println("Number occurenc is a "+countOccure);
		
	}	
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		

}
