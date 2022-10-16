package loops;
abstract class Bird {
	 abstract void makeSound();
	}
	class sparrow extends Bird {
	 public void makeSound() {
	 System.out.println("The sound that a sparrow makes : khoo khooo");
	 
	 }
	}
	class parrot extends Bird {
	 public void makeSound() {
	 System.out.println("The sound that an parrot makes: kee keee");
	 
	 }
	}
public class abstracteg1 {

		public static void main(String[] args) {
			sparrow s = new sparrow();
			 s.makeSound();
			 
			 parrot p = new parrot();
			 p.makeSound();
	}

}
