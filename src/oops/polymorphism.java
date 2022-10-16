package oops;
class polygon
{
	public void render()
	{
		System.out.println("rendering polygon");
	}
}
class square extends polygon
{
	public void render()
	{
		System.out.println("rendering square");
	}
}
class circle extends polygon
{
	public void render()
	{
		System.out.println("rendering circle");
	}
}

public class polymorphism {

	public static void main(String[] args) {
		circle c1=new circle();
		c1.render();
		square s1=new square();
		s1.render();
		polygon p1=new polygon();
		p1.render();

	}

}
