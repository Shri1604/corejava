package file;

public class student {
int rollno;String name;
static String college="APEC";
student(int r,String n){
	rollno=r;name=n;
}
void display() {System.out.println(rollno+""+name+""+college);}
	public static void main(String[] args) {
	student s1=new student(01,"abar");
	student s2=new student(11,"shri");
s1.display();
s2.display();
	}

}

