package forloops;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
char ch= 'A';
for(i=1;i<=5;i++)
{
	for(j=5;j>=1;j--)
	 {
		if(j<=i)
			System.out.print(ch+"\t");
		else
			System.out.print(" "+"\t");
		
	}
	System.out.println();
	
	
}
	}

}
