/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.threadFramework.Semaphore.tryAcquire_2   
 * @author: penggang
 * @date:   2018年2月16日 上午11:51:49   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Semaphore.tryAcquire_2;

import java.util.concurrent.Semaphore;

/**  
 * @ClassName:  Service   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年2月16日 上午11:51:49   
 * 
 **/
public class Service {

	private Semaphore semaphore = new Semaphore(3);

	public void testMethod() {
		if (semaphore.tryAcquire(3)) {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "首选进入！");
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newString = new String();
				Math.random();
			}
			// 方法release对应的permits值也要更改
			semaphore.release(3);
		} else {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "未成功进入！");
		}

	}
}