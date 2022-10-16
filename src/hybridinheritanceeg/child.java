package hybridinheritanceeg;
class HumanBody {
	public void displayHuman()
	{
		System.out.println("Method defined inside humanBody class");
	}
	}
interface Male
{
	  public void show();
}
interface Female
		{
		public void show();
		}
public class child extends HumanBody implements Male,Female {
	public void show()
	{
		System.out.println("Implimentation of show()method defines in interface Male and Female");
	}
	public void displaychild()
	{
		System.out.println("Method defined child class");
	}


   public static void main(String[] args) {	
child obj=new child();
System.out.println("Implimentation of hybrid inheritance in Java");
obj.show();
obj.displaychild();
}

}
		



