package ExOfObjectClass;

public class city {
	//declaring class variables
	public String name;
	public long population;
	//defining the method of the class
	public void display()
	{
		System.out.println("city name:"+name);
		System.out.println("population:"+population);
	}
	public static void main(String[] args) {
		//declaring the object of the class 
	city metro1,metro2;
	//instance the object of the class using new keyword
	metro1=new city();//constructor
	metro2=new city();
	metro1.name="banglore";
	metro1.population=235678;
	System.out.println("details of metro city1:");
	metro1.display();
	//display the method
	metro2.name="mumbai";
	metro2.population=5678;
	System.out.println("details of metro city2:");
	metro2.display();
	
	
	
	}

}
