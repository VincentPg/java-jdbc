/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyObject.java   
 * @Package cn.com.study.multithread.synchronize.twoObject2   
 * @author: penggang
 * @date:   2018年1月29日 下午11:49:10   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.twoObject2;

/**  
 * @ClassName:  MyObject   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月29日 下午11:49:10   
 * 
 **/
public class MyObject {
	
	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName="
					+ Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+ "'s endTime=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void methodB() {
		try {
			System.out.println("begin methodB threadName="
					+ Thread.currentThread().getName() + " begin time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+ " end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
