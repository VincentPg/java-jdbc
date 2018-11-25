/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.threadFramework.Semaphore.tryAcquire_1   
 * @author: penggang
 * @date:   2018年2月16日 上午11:38:46   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Semaphore.tryAcquire_1;

import java.util.concurrent.Semaphore;

/**  
 * @ClassName:  Service   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年2月16日 上午11:38:46   
 * 
 **/
public class Service {

	private Semaphore semaphore = new Semaphore(1);

	public void testMethod() {
		if (semaphore.tryAcquire()) {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "首选进入！");
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				String newString = new String();
				Math.random();
			}
			semaphore.release();
		} else {
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "未成功进入！");
		}
	}
}
