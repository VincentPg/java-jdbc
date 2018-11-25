package cn.com.study.multithread.communication.waitNotify.producers_consumers.two;

/**  
 * 多生产与多消费：操作值-假死
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P160 
 * @author: penggang
 * @date:   2018年2月6日 下午9:48:42   
 * 
 **/
public class Run {
	public static void main(String[] args) throws InterruptedException {

		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);

		ThreadP[] pThread = new ThreadP[2];
		ThreadC[] rThread = new ThreadC[2];

		for (int i = 0; i < 2; i++) {
			pThread[i] = new ThreadP(p);
			pThread[i].setName("生产者" + (i + 1));

			rThread[i] = new ThreadC(r);
			rThread[i].setName("消费者" + (i + 1));

			pThread[i].start();
			rThread[i].start();
		}

		Thread.sleep(5000);
		Thread[] threadArray = new Thread[Thread.currentThread()
				.getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);

		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName() + " "
					+ threadArray[i].getState());
		}
	}
}
