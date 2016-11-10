package thread;

public class RunnableDemo {

	public static void main(String[] args) {
		TestThread1 t = new TestThread1();
		new Thread(t).start();
		for (int i = 0; i < 5; ++i) {
			System.out.println("***main线程在运行");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
class TestThread1 implements Runnable{
	public void run(){
		for (int i = 0; i<5; ++i) {
			System.out.println("TestThread在运行***");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}