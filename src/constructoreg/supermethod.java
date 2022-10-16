package constructoreg;


public class supermethod extends SuperClass {
	public supermethod() {
		super("java");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
supermethod supermethod = new supermethod();
	}
}
class SuperClass{
	SuperClass(String name){
		System.out.println("this constructor received nameargument"+ name);
	
	}
}
