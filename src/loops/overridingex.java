package loops;
//parent class
class bank
{
	int gerrateofinterest()
	{
		return 0;
	}}
	//creating child class
	class sbi extends bank
	{
		int gerrateofinterest()
		{
			return 8;
		}}
		class icici extends bank
		{
			int gerrateofinterest()
			{
				return 7;
			}}
			class axis extends bank
			{
				int gerrateofinterest()
				{
					return 9;
				}
			}
	

public class overridingex {

	public static void main(String[] args) {
	sbi s=new sbi();
    icici i=new icici();
	axis a=new axis();
	System.out.println("sbi rates of interest:"+s.gerrateofinterest());
	System.out.println("icici rates of interest:"+i.gerrateofinterest());
	System.out.println("axis rates of interest:"+a.gerrateofinterest());
	
	}}


