package thread;

public class priorityEx extends Thread {
	
		public void run()
		{
		System.out.println("Priority of Thread is:"+Thread.currentThread().getPriority());
		}
	public static void main(String[] args) {
		priorityEx t1= new  priorityEx();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();

	}

}
