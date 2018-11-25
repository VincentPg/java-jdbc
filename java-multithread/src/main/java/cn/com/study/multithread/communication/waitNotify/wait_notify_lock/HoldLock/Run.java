/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.wait_notify_lock.HoldLock   
 * @author: penggang
 * @date:   2018年2月1日 下午12:51:29   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify_lock.HoldLock;

/**  
 * notify方法执行后不释放锁，只有notify方法所在的synchronized的代码执行完后才会释放锁。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P144    
 * @author: penggang
 * @date:   2018年2月1日 下午12:51:29   
 * 
 **/
public class Run {
	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

		synNotifyMethodThread c = new synNotifyMethodThread(lock);
		c.start();

	}
}
