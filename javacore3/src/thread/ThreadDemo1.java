package thread;

public class ThreadDemo1 {
	public static void main(String[] args) {
		//修改过后1
		/*new TestThread().start();
		new TeatHeread().start();
		new TeatHeread().start();
		new TeatHeread().start();*/
		
		TeatHeread t = new TeatHeread();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		
		
		/*TestThread t1 = new TestThread();
		t1.start();
		t1.start();
		t1.start();
		t1.start();*/
	}

}
class TeatHeread extends Thread{
	private int tickets = 5;
	public void run(){
		while (tickets > 0) {
			System.out.println(Thread.currentThread().getName() + "出售票" + tickets);
			tickets -= 1;
		}
	}
}