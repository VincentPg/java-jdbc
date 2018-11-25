/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadA.java   
 * @Package cn.com.study.multithread.communication.wait_notify_lock.ReleaseLock   
 * @author: penggang
 * @date:   2018年2月1日 下午12:48:45   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify_lock.ReleaseLock;

/**  
 * @ClassName:  ThreadA   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年2月1日 下午12:48:45   
 * 
 **/
public class ThreadA extends Thread{
	
	private Object lock;

	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service service = new Service();
		service.testMethod(lock);
	}
}
