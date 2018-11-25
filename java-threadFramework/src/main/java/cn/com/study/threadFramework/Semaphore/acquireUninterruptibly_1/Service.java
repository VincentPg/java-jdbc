/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.threadFramework.Semaphore.acquireUninterruptibly_1   
 * @author: penggang
 * @date:   2018年2月15日 下午7:25:56   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Semaphore.acquireUninterruptibly_1;

import java.util.concurrent.Semaphore;

/**  
 * @ClassName:  Service   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年2月15日 下午7:25:56   
 * 
 **/
public class Service {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethod() {
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()
					+ " begin timer=" + System.currentTimeMillis());
			for (int i = 0; i < Integer.MAX_VALUE / 50; i++) {
				String newString = new String();
				Math.random();
			}
			System.out.println(Thread.currentThread().getName()
					+ "   end timer=" + System.currentTimeMillis());
			semaphore.release();
		} catch (InterruptedException e) {
			System.out.println("线程" + Thread.currentThread().getName()
					+ "进入了catch");
			e.printStackTrace();
		}
	}
}
