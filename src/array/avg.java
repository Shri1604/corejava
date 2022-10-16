package array;

public class avg {

	public static void main(String[] args) {
		int[ ] num = new int[6];

		num[0] = 20;
		num[1] = 30;
		num[2] = 40;
		num[3] = 50;
		num[4] = 60;
		num[5] = 70;

		double avg = 0.0;
		int sum = 0;
		//Find the sum of these numbers.
		 for(int i = 0; i <6; i++)
		    sum  = sum + num[i];
		    avg = (double)sum/6;
		 System.out.println("Sum of six numbers: " +sum);
		 System.out.println("Average of six numbers: " +avg);


	}

}
