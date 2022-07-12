package StringStudy;

public class StringsMethod {

	public static void main(String[] args) {
          String name="manisha";
          //String name="manisha";
          String name1=" ";
          String n2="";
          System.out.println(name.contains("ni")+" " +"====contains () use");
          System.out.println(name.isEmpty() +"=== isempty with string");     //check the lenght=0 is true
          System.out.println(name1.isEmpty()+"=== isempty with white spece");
          System.out.println(n2.isEmpty()+"=== isempty without white spece");
         System.out.println();
          //blanck
         System.out.println(name.isBlank()+"=== isblack with strimg");
          System.out.println(name1.isBlank()+"=== isblack with white spece");
          System.out.println(n2.isBlank()+"=== isblack without white spece");
          System.out.println(name.indexOf("n"));
	}

}
