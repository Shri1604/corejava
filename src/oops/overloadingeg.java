package oops;

public class overloadingeg {
	void sum(int a, long b) {
		System.out.println(a+b);
	}
	void sum(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
overloadingeg obj=new overloadingeg();
obj.sum(50,150);
obj.sum(50, 150,250);
	}

}
