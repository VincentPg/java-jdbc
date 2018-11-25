/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread.java   
 * @Package cn.com.study.multithread.base.currentThread   
 * @author: penggang
 * @date:   2018年1月28日 下午9:58:09   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.currentThread;

/**  
 * @ClassName:  MyThread   
 * @Description:   
 * @author: penggang
 * @date:   2018年1月28日 下午9:58:09   
 * 
 **/
public class MyThread extends Thread{
	public MyThread() {
		System.out.println("构造方法的打印：" + Thread.currentThread().getName());
	}

	public void run() {
		System.out.println("run方法的打印：" + Thread.currentThread().getName());
	}
}
