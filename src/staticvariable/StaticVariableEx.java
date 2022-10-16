package staticvariable;
class Student {
String name;
int regno;
static String college="APEC";
Student(String n,int r)
{
name=n;
regno=r;
}
void display()
{
System.out.println(regno+ ""+name+"" +college);
}
}
public class StaticVariableEx {

	public static void main(String[] args) {
		Student s1= new Student("shri",123);
		Student s2= new Student("kani",456);
		s1.display();
		s2.display();	

	}

}
