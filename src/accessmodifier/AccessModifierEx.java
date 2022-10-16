package accessmodifier;
 class ParentClass{
	 int a= 10;
	 public int b =20;
	 protected int c= 30;
	 private int d = 40;
	 void showData() {
		 System.out.println("Inside ParentClass");
		 System.out.println("a =" +a);
		 System.out.println("b =" +b);
		 System.out.println("c =" +c);
		 System.out.println("d =" +d);
	 }
}
 class childclass extends ParentClass{
	 void accessData() {
		 System.out.println("Inside ParentClass");
		 System.out.println("a =" +a);
		 System.out.println("b =" +b);
		 System.out.println("c =" +c);
		 //System.out.println("d ="+d);//private member cant be accessed
	 }
 }
 public class AccessModifierEx{
	 public static void main(String[]args){
		 childclass obj=new childclass();
		 obj.showData();
		 obj.accessData();
		 
	 }
	 
 }
