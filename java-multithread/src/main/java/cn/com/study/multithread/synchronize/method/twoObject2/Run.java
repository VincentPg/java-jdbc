/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.twoObject2   
 * @author: penggang
 * @date:   2018年1月29日 下午11:48:07   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.twoObject2;

/**  
 * 结论:
 * 1) A线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronized类型的方法。
 * 2) A线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法则需要等待，也就是同步。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P61 
 * @author: penggang
 * @date:   2018年1月29日 下午11:48:07   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		MyObject object = new MyObject();    //对象实例object
		ThreadA a = new ThreadA(object);	 //线程A访问实例object
		a.setName("A");
		ThreadB b = new ThreadB(object);	 //线程B访问实例object
		b.setName("B");

		a.start();
		b.start();
	}
}
