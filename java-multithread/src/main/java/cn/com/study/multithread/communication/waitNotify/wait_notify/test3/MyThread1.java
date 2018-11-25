/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread1.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test3   
 * @author: penggang
 * @date:   2018年1月31日 下午11:12:40   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test3;

/**  
 * @ClassName:  MyThread1   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午11:12:40   
 * 
 **/
public class MyThread1 extends Thread{
	
	private Object lock;            //非this的x对象

	public MyThread1(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("开始      wait time=" + System.currentTimeMillis());
				lock.wait();             //使当前线程进行等待。
				System.out.println("结束      wait time=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
