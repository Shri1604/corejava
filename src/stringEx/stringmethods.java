package stringEx;

public class stringmethods {

	public static void main(String[] args) {
	String a= "cooking";
	System.out.println("String a="+a);
	String b=new String("IOT");
	System.out.println("String b=+b");
	System.out.println("the length of the string:"+a.length());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a+b);
	System.out.println(a.concat(b));
	System.out.println(a.toUpperCase());
	System.out.println("character at position 5:"+a.charAt(5));
	System.out.println(a.equals(b));
	System.out.println(a.equalsIgnoreCase(b));
	System.out.println(a.compareTo(b));
	System.out.println(a.contains("x"));
	
	
	

	}

}
