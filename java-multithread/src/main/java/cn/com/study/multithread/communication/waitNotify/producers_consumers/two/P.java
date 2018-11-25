package cn.com.study.multithread.communication.waitNotify.producers_consumers.two;

//生产�?
public class P {

	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (!ValueObject.value.equals("")) {
					System.out.println("生产�? "
							+ Thread.currentThread().getName() + " WAITING了★");
					lock.wait();
				}
				System.out.println("生产�? " + Thread.currentThread().getName()
						+ " RUNNABLE�?");
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				ValueObject.value = value;
				lock.notify();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
