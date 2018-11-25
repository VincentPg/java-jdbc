/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread2.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test3   
 * @author: penggang
 * @date:   2018年1月31日 下午11:13:19   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test3;

/**  
 * @ClassName:  MyThread2   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午11:13:19   
 * 
 **/
public class MyThread2 extends Thread{
	
	private Object lock;

	public MyThread2(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("开始notify time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("结束notify time=" + System.currentTimeMillis());
		}
	}
}
