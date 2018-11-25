package cn.com.study.threadFramework.Semaphore.repast;

public class ThreadP extends Thread {

	private RepastService service;

	public ThreadP(RepastService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.set();
	}

}
