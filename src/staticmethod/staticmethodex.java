package staticmethod;
class Student {
String name;
int regno;
static String college="APEC";
static void change()
{
college="APEC";
}
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
public class staticmethodex {

	public static void main(String[] args) {
		Student.change();
		Student s1= new Student("shri",123);
		Student s2= new Student("kani",456);
		Student s3= new Student("kiru",789);
		s1.display();
		s2.display();
		s3.display();


	}

}
