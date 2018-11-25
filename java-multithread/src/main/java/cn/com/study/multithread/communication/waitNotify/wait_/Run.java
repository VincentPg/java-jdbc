/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.wait_   
 * @author: penggang
 * @date:   2018年2月1日 下午8:51:00   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_;

/**  
 *   带一个参数的wait(long)方法的功能是等待某一时间内是否有线程对锁进行唤醒，
 * 如果超过这个时间则自动唤醒。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P151  
 * @author: penggang
 * @date:   2018年2月1日 下午8:51:00   
 * 
 **/
public class Run {
	static private Object lock = new Object();
	static private Runnable runnable1 = new Runnable() {
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("wait begin timer="
							+ System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("wait   end timer="
							+ System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	static private Runnable runnable2 = new Runnable() {
		public void run() {
			synchronized (lock) {
				System.out.println("notify begin timer="
						+ System.currentTimeMillis());
				lock.notify();
				System.out.println("notify   end timer="
						+ System.currentTimeMillis());
			}
		}
	};

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(runnable1);
		t1.start();
		Thread.sleep(3000);
		Thread t2 = new Thread(runnable2);
		t2.start();
	}
}
