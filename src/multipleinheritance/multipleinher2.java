package multipleinheritance;
class java implements javarun,javaprogram,javaoops
{
	public void run()
	{
		System.out.println("java is a run");
	}
	public void program()
	{
		System.out.println("java is a program");
	}
	public void oops()
	{
		System.out.println("java is a oops");
	}
}
public class multipleinher2 {

	public static void main(String[] args) {
		java j=new java();
		j.run();
		j.program();
		j.oops();

}

	}


