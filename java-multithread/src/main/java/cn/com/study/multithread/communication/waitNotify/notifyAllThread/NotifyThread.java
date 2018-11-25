package cn.com.study.multithread.communication.waitNotify.notifyAllThread;


public class NotifyThread extends Thread {
	private Object lock;

	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			lock.notifyAll();    //����ȫ���̡߳�
		}
	}

}