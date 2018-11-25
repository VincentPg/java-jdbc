/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread.java   
 * @Package cn.com.study.threadFramework.Semaphore.Pool_List   
 * @author: penggang
 * @date:   2018年2月16日 下午12:26:23   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Semaphore.Pool_List;

/**  
 * @ClassName:  MyThread   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年2月16日 下午12:26:23   
 * 
 **/
public class MyThread extends Thread {

	private ListPool listPool;

	public MyThread(ListPool listPool) {
		super();
		this.listPool = listPool;
	}

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			String getString = listPool.get();
			System.out.println(Thread.currentThread().getName() + " 取得值 "
					+ getString);
			listPool.put(getString);
		}
	}

}
