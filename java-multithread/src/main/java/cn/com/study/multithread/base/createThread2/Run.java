/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.createThread2   
 * @author: penggang
 * @date:   2018年1月28日 下午9:15:44   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.createThread2;

/**  
 * 如果准备创建的线程类已经继承了其它类，那么则需要Runnable接口。
 * Java多实现解决java单继承的问题，实现多继承的效果。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P8  
 * @author: penggang
 * @date:   2018年1月28日 下午9:15:44   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		System.out.println("运行结束!");
	}
}
