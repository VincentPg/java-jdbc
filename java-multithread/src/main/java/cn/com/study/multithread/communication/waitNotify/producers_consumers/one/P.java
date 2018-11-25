package cn.com.study.multithread.communication.waitNotify.producers_consumers.one;

//������
public class P {

	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				if (!ValueObject.value.equals("")) {
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				System.out.println("set��ֵ��" + value);
				ValueObject.value = value;
				lock.notify();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
