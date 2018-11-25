package cn.com.study.threadFramework.Semaphore.Fair;

public class MyThread extends Thread {

	private MyService myService;

	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		System.out.println("ThreadName=" + this.getName() + "∆Ù∂Ø¡À");
		myService.testMethod();
	}

}
