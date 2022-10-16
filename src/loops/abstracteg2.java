package loops;
class ABC
{ 
 public void print_ABC() 
 { 
 System.out.println("java program"); 
 } 
} 
 
class XYZ extends ABC 
{
	public void print_XYZ() 
	 { 
	 System.out.println("loops"); 
	 } 
	}

public class abstracteg2 {

	public static void main(String[] args) {
		XYZ d = new XYZ(); 
		 d.print_ABC(); 
		 d.print_XYZ();



	}

}
