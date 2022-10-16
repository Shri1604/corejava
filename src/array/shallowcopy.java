package array;

public class shallowcopy {

	public static void main(String[] args) {
		int intArray[][]= {{1,2,3,4,5},{6,7,8,9,10}};
		int CloneArray[][]=intArray.clone();
		System.out.println(intArray[0]==CloneArray[0]);
		System.out.println(intArray[1]==CloneArray[1]);
		
	}

}
