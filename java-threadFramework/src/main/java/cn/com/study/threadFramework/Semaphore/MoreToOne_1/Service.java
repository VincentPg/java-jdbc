/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.threadFramework.Semaphore.MoreToOne_1   
 * @author: penggang
 * @date:   2018年2月16日 下午12:04:14   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Semaphore.MoreToOne_1;

import java.util.concurrent.Semaphore;

/**  
 * @ClassName:  Service   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年2月16日 下午12:04:14   
 * 
 **/
public class Service {

	private Semaphore semaphore = new Semaphore(3);

	public void sayHello() {
		try {
			semaphore.acquire();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "准备");
			System.out.println("begin hello " + System.currentTimeMillis());
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "打印"
						+ (i + 1));
			}
			System.out.println("  end hello " + System.currentTimeMillis());
			semaphore.release();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "结束");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
