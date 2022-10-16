package mp;
import java.util.Scanner;
public class sms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
	     System.out.println("***WELCOME TO STUDENT REGISTRATION SYSTEM***");//for 11th and 12th standard
	      do {
	    	  
	    	  sms b=new sms();
	    	  System.out.println("1.ADD RECORDS :");
	    	  System.out.println("2.GUARIDIAN RECORD :");
	    	  System.out.println("3.COURSE DETIALS :");
	    	  System.out.println("4.EXIT");
	    	  System.out.println("5.ENTER YOUR CHOICE :");
	    	  int choice = sc.nextInt();
	    	     
	    	      switch(choice)
	    	      {
	    	      case 1:b.add();
	    	            break;
	    	      case 2:b.parent();
	    	            break;
	    	      case 3:b.course();
	    	            break;
	    	      case 4:b.exit();
	    	            break;
	    	      default :System.out.println("YOU HAVE ENTERED INVALID NUMBER");
	    	            break;
	    	            
	    	      }
	    	         System.out.println("DO YOU WANT TO CONTIUNE PRESS 1 ");
	    	         
	      }
	      while(sc.nextInt()==1);
		}

		Scanner sc=new Scanner(System.in);
		void add() {
			System.out.println("***STUDENT'S DETIALS***");
			System.out.println("ENTER STUDENT'S NAME :");
			String a= sc.nextLine();
			
			System.out.println("ENTER STUDENT ID :");
			String f= sc.nextLine();
			
			System.out.println("ENTER STUDENT'S ADDRESS :");
			String b= sc.nextLine();
			
			System.out.println("ENTER STUDENT'S DOB :");
			String c= sc.nextLine();
			
			System.out.println("ENTER STUDENT'S CONTACT NUMBER :");
			String d= sc.nextLine();
			
			System.out.println("ENTER FIRST LANGUAGE :");
			String g= sc.nextLine();
			
		    System.out.println("ENTER SECOND LANGUAGE :");
		    String h= sc.nextLine();
		    
		    System.out.println("ENTER NATIONALITY :");
		    String i= sc.nextLine();
		    
		    System.out.println("ENTER 10TH MARK AND PERCENTAGE :");
		    String j= sc.nextLine();
			
			
		}
		void parent() {
			
			System.out.println("***STUDENT'S GUARIDIAN DETIALS***");
			System.out.println("ENTER STUDENT'S PARENT NAME :");
			String a= sc.nextLine();
			
			System.out.println("ENTER STUDENT'S PARENT Email ID :");
			String c= sc.nextLine();
			
			System.out.println("ENTER STUDENT'S PARENT CONTACT NUMBER :");
			String d= sc.nextLine();
			
			System.out.println("ENTER STUDENT'S PARENT GENDER :");
			String e= sc.nextLine();
			
			System.out.println("ENTER STUDENT'S PARENT OCCUPATION :");
			String h= sc.nextLine();
			}
		void course() {
			System.out.println("Enter the number between 1 to 4: ");
		      int a = sc.nextInt();
		      if(a>0 && a<=4) {
		      System.out.println("you have selected : " +a);
		      }switch(a)
		      {
		    	  case 1:
		    		  System.out.println("COMPUTER SCIENCE");
		    		  break;
		    	  case 2:
		    		  System.out.println("BIOLOGY");
		    		  break;
		    	  case 3:
		    		  System.out.println("COMMERCE");
		    		  break;
		    	  case 4:
		    		  System.out.println("PURE SCIENCE");
		    		  break;
		    	  default:System.out.println("YOU HAVE ENTERED INVALID NUMBER");
		      }
		}
		

		
		void exit()
		{
			System.out.println("***THANKS FOR VISITING***");
	}

}

     