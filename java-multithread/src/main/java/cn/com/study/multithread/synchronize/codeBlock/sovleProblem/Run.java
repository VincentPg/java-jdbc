package cn.com.study.multithread.synchronize.codeBlock.sovleProblem;

/**  
 * 同步代码解决同步方法的弊端：
 * 	 当一个线程访问object的一个synchronized同步代码块时，另一个线程
 * 仍然可以访问该object对象中的非synchronized(this)同步代码块。这样提高运行效率。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P76 
 * @author: penggang
 * @date:   2018年1月30日 下午10:31:15   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		Task task = new Task();

		MyThread1 thread1 = new MyThread1(task);
		thread1.start();

		MyThread2 thread2 = new MyThread2(task);
		thread2.start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long beginTime = CommonUtils.beginTime1;
		if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
			beginTime = CommonUtils.beginTime2;
		}

		long endTime = CommonUtils.endTime1;
		if (CommonUtils.endTime2 > CommonUtils.endTime1) {
			endTime = CommonUtils.endTime2;
		}

		System.out.println("耗时：" + ((endTime - beginTime) / 1000));
	}
}
