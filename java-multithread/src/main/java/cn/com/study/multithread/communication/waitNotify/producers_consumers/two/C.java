package cn.com.study.multithread.communication.waitNotify.producers_consumers.two;

//消费�?
public class C {

	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				while (ValueObject.value.equals("")) {
					System.out.println("消费�? "
							+ Thread.currentThread().getName() + " WAITING了☆");
					lock.wait();
				}
				System.out.println("消费�? " + Thread.currentThread().getName()
						+ " RUNNABLE�?");
				ValueObject.value = "";
				lock.notify();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
