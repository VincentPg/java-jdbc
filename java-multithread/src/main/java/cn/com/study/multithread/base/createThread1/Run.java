/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.createThread1   
 * @author: penggang
 * @date:   2018年1月28日 下午8:44:20   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.createThread1;

/**  
 * 注意观察执行结果和代码顺序不一致。
 * 	线程调用的随机性。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P5
 * 				 继承Thread，创建线程。
 * @author: penggang
 * @date:   2018年1月28日 下午8:44:20   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		System.out.println("运行结束！");
	}
}
/**
 * 
 * 运行结束！
 *current Thread:Thread-0
 * 
 */
