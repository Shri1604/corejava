package inheritance;
class car
{
	public car()
	{
		System.out.println("class car");
	}
	public void vehicletype()
	{
		System.out.println("vehicletype:car");	
	}
}
	class maruti extends car
	{
		public maruti()
		{
			System.out.println("class:maruti");	
		}
		public void brand()
		{
			System.out.println("brand:maruti");
		}
		public void speed()
		{
			System.out.println("max:90");	
		}
		
	}

public class multileveleg extends maruti {
public  multileveleg()
{
	System.out.println("maruti model:800");
}
public void speed()
{
	System.out.println("max:80");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 multileveleg obj=new	multileveleg();
		 obj.vehicletype();
		 obj.brand();
		 obj.speed();
	}

}
