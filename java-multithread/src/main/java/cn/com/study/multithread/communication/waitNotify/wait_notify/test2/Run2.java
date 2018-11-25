/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run2.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test2   
 * @author: penggang
 * @date:   2018年1月31日 下午10:56:55   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test2;

/**  
 * wait()的作用：
 * 	  Object类的方法，将当前线程置入"预执行队列"中，并且在wait()所在的代码行处停止
 * 执行，直到接到通知或被中断为止。
 * wait()的使用思路：
 * (1)在调用wait()之前，当前线程必须获得该对象的对象级别锁(即只能在同步方法或同步块中调用wait()方法)
 * (2)执行wait()方法后，当前线程释放锁。
 * (3)在从wait()返回继续执行下面的代码前，当前线程与其它线程竞争重新获取锁。
 * 注意：
 * 	 如果调用wait()方法时没有持有适当的锁，则抛出异常java.lang.IllegalMonitorStateException
 * @ClassName:  Run2   
 * @Description:Java多线程编程核心技术 --高洪岩 P137  
 * @author: penggang
 * @date:   2018年1月31日 下午10:56:55   
 * 
 **/
public class Run2 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn上面");
			synchronized (lock) {    // 对象监视器。synchronized(非this对象x)
				System.out.println("syn第一行");
				lock.wait();  //main线程执行到此行代码后等待。停止不前,不继续向下运行。并释放对象锁lock。接着和其它线程竞争重新获取锁。
				System.out.println("wait下的代码！");
			}
			System.out.println("syn下面的代码");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
