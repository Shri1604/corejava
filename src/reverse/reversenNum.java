package reverse;

public class reversenNum {

	public static void main(String[] args) {
		int num =6789, reversed = 0;
		System.out.println("original number:"+ num);
		while(num !=0) {
			int digit = num%10;
			reversed = reversed *10+digit;
			num /=10;
			
		}
System.out.println("reversed number:" +reversed);
	}

}
