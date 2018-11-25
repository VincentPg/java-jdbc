/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.multithread.communication.wait_notify_lock.HoldLock   
 * @author: penggang
 * @date:   2018年2月1日 下午12:52:20   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify_lock.HoldLock;

/**  
 * @ClassName:  Service   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年2月1日 下午12:52:20   
 * 
 **/
public class Service {
	public void testMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait() ThreadName="
						+ Thread.currentThread().getName());
				lock.wait();
				System.out.println("  end wait() ThreadName="
						+ Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void synNotifyMethod(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin notify() ThreadName="
						+ Thread.currentThread().getName() + " time="
						+ System.currentTimeMillis());
				lock.notify();
				Thread.sleep(5000);
				System.out.println("  end notify() ThreadName="
						+ Thread.currentThread().getName() + " time="
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
