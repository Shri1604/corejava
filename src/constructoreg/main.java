package constructoreg;

public class main {
	String studentname;
	int studentage;
	main(String name,int age){
		studentname=name;
		studentage=age;
		age=30;
	}
		void display() {
			System.out.println(studentname+" "+studentage);
		}
		public static void main(String args[])
		{
			main myobj=new main("shrivarshini",23);
			myobj.display();
		}
	}


