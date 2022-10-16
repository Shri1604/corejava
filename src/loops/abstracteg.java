package loops;
//abstract class
abstract class animal
{
	//abstract method
	public abstract void animalsound();
	///regular method
	public void sleep()
	{
		System.out.println("zzzzz");
	
	}
}
//subclass (inherit from animal)
class pig extends animal
{
	public void animalsound()
	{
		//the body of the animal sound 
		System.out.println("the pig say: we wee ");
	}
}

public class abstracteg {

	public static void main(String[] args) {
		pig obj=new pig();
		obj.sleep();

	}

}
