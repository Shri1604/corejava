package oopsEx;
//parent class
 class booksEx {
	void run()
	{
	System.out.println("Book not in stock");
	} 
	} 
	//child class 
	public class books extends booksEx{
	void run()
	{
	System.out.println("Book is available");
	}

	public static void main(String[] args) {
		
		 books obj = new  books();
		obj.run(); 
	}

}
