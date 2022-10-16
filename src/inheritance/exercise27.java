package inheritance;

class sleeping
{ 
 public void print_sleeping() 
 { 
 System.out.println("sleep time is 10pm to 5am"); 
 } 
} 
 
class yoga extends sleeping 
{ 
 public void print_yoga() 
 { 
 System.out.println("workouttime is 6am to 8am"); 
 } 
} 
class working extends sleeping 
{ 
 public void print_working() 
 { 
 System.out.println("working time is 10am to 5pm"); 
 } 
} 
public class exercise27 {
public static void main(String[] args) {
working w = new working(); 
 w.print_sleeping();
 yoga y = new yoga(); 
 y.print_yoga();
 
 


	}

}
