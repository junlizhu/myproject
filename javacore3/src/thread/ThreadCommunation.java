package thread;


public class ThreadCommunation {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = Thread.currentThread();
		System.out.println("Thread.currentThread(): " + Thread.currentThread());
		System.out.println("thread.isDaemon(): " + thread.isDaemon());
		System.out.println("thread.getName(): " + thread.getName());
		System.out.println("thread.getId(): " + thread.getId());
		System.out.println("thread.getPriority(): " + thread.getPriority());
		System.out.println("thread.toString(): " + thread.toString());
		System.out.println("准备休眠10秒" );
		System.out.println("休眠4秒前的时间：" + System.currentTimeMillis());
		thread.sleep(4000);
		System.out.println("休眠4秒后的时间：" + System.currentTimeMillis());
		
		
		
	}

}
