package hybridinheritanceeg;
interface c
{
 public void c();
}
interface sql extends c
{
 public void sql();
}
interface html extends c
{
 public void html();
}

public class languageeg28 implements sql,html {
	public void c()
	 {
	 System.out.println("c");
	 }
	 public void sql()
	 {
	 System.out.println("sql");
	 }
	 public void html()
	 {
	 System.out.println("html");
	 }
	public static void main(String[] args) {
		languageeg28 obj1= new languageeg28();
		 obj1.c();
		 obj1.sql();
		 obj1.html();
	}

}
