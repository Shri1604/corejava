package garbage;

public class finalizemethodex {

	public static void main(String[] args) {
		 finalizemethodex str2 = new finalizemethodex ();
		  str2 = null;
		       
		        System.gc();
		        System.out.println("output of main method");

		    }
		    
		    protected void finalize()
		    {
		        System.out.println("output of finalize method");
	

	}

}
