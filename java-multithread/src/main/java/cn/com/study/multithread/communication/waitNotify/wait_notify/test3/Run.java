/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test3   
 * @author: penggang
 * @date:   2018年1月31日 下午11:11:09   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test3;

/**  
 * 结论：wait使线程停止以女性，而notify使停止的线程继续运行。
 * 
 * notify()作用：
 * 		通知那些可能等待该对象的对象锁的其它线程，如果有多个线程等待，则
 * 由线程规划器随机挑选出其中一个呈wait状态的线程，对其发出通知notify，并使它
 * 等待获取该对象的对象锁。
 * 
 * 使用思路：
 * 	(1)调用前，当前线程必须获得该对象的对象级别锁(即只能在同步方法或同步块中调用notify()方法)
 * 	(2)执行notify()方法后，当前线程不会马上释放该对象锁，呈wait状态的线程也并不能马上获取该对象
 * 锁,要等到执行notify()方法的线程将程序执行完，也就是退出synchronized代码块后，当前线程才会释放
 * 锁，而呈wait状态所在的线程才可以获取该对象锁。
 *  (3)当第一个获得了该对象锁的wait线程运行完毕以后，它会释放掉该对象锁，此时如果对象没有再次使用
 * notify语句，则即便对象已经空闲，其它wait状态等待的线程由于得到该对象的通知，还会继续阻塞在wait
 * 状态，知道这个对象发出一个notify或notifyAll。
 * 
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P138   
 * @author: penggang
 * @date:   2018年1月31日 下午11:11:09   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		try {
			Object lock = new Object();   //创建非this对象

			MyThread1 t1 = new MyThread1(lock);
			t1.start();

			Thread.sleep(3000);

			MyThread2 t2 = new MyThread2(lock);
			t2.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
