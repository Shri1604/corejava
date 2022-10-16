package exceptioneg;

public class testthrow {
	public static void checknum(int num)
	{
		if(num<1)
		{
			throw new ArithmeticException("\nnumber is negative");
		}
		else
		{
			System.out.println("square of:"+num+"is"+(num*num));
		}
	}

	public static void main(String[] args) {
		testthrow obj=new testthrow();
		obj.checknum(7);
		System.out.println("rest of the code");

	}

}
