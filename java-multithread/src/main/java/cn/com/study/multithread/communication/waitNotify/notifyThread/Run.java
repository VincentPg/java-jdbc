/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.notifyThread   
 * @author: penggang
 * @date:   2018年2月1日 下午1:47:21   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.notifyThread;

/**  
 * 调用notify()一次只随机通知一个线程被唤醒，当多次调用notify()方法时，会随机将等待wait状态的线程
 * 进行唤醒。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P148
 * @author: penggang
 * @date:   2018年2月1日 下午1:47:21   
 * 
 **/
public class Run {
	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

		ThreadC c = new ThreadC(lock);
		c.start();

		Thread.sleep(1000);

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

	}
}
