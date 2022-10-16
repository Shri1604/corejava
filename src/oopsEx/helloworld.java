package oopsEx;

public class helloworld {
	void sum(int a,double b)
	{
	System.out.println(a+b);
	} 
	void sum(double b,int a)
	{
	System.out.println(a+b);
	}

	public static void main(String[] args) {
		helloworld obj=new helloworld(); 
		obj.sum(50,150.0); 
		obj.sum(50.0,250);
		
	}

}
