package cn.com.study.multithread.communication.waitNotify.producers_consumers.three;

public class ThreadR extends Thread {

	private C r;

	public ThreadR(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.getValue();
		}
	}

}
