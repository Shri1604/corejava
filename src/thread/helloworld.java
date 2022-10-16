package thread;

public class helloworld{

	public static void main(String[] args) {
		 multiThraed thread1 = new multiThraed ("Thread1");  
		thread1.start();  
		 multiThraed thread2 = new multiThraed ("Thread2");  
		thread2.start();          
		}
		}  
class multiThraed implements Runnable {  
Thread cooking;  
private String IoT;  
multiThraed(String name)
{  
IoT = name;  
}  
@Override  
public void run()
{  
System.out.println("Thread running" + IoT);  
for (int i = 0; i < 4; i++)
{    
System.out.println(i);  
System.out.println(IoT);    
try
{    
Thread.sleep(1000);    
}    
catch (InterruptedException e)
{
System.out.println("Thread is interrupted");  
}
}
}
public void start()
{    
System.out.println("Thread started");  
if (cooking == null)
{  
cooking = new Thread(this, IoT);    
cooking.start();  
}

	}

}
