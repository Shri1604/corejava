package stringEx;

public class multidimarray {

		public static void main(String...  g)
		{
			int arr1[] = new int[10];
			int arr2[][]= new int[4][3];
			
			
			System.out.println(Integer.SIZE/8);
			
			System.out.println("arr 1 : "+(arr1.length));
			
			System.out.println("arr 2 : "+(arr2.length));
			
			System.out.println("arr 2 Total Locations: "+(arr2.length)*3);
			
			
			System.out.println("\narr 1 Total Size: "+(arr1.length) * (Integer.SIZE/8));
			
			System.out.println("\narr 2 Total Size: "+((arr2.length)*3) * (Integer.SIZE/8));

	}

}
