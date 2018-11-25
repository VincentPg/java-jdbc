/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.twoObject   
 * @author: penggang
 * @date:   2018年1月29日 下午10:41:38   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.twoObject;

/**  
 * 多个对象多个锁
 * 
 * 结论：两个线程分别访问同一个类的两个不同的实例的相同名称的同步方法，以异步的方式运行。
 * 
 * synchronized获取的是对象锁，而不是将一段代码或方法(函数)当作锁。
 * 
 * 如果多个线程访问的是同一个对象，那么哪个线程先执行带synchronized关键字的方法，哪个线程
 * 就持有该方法所属对象的锁Lock，那么其它线程处于等待状态。
 * 
 * 如果多个线程访问多个对象，则JVM会创建多个锁。
 * 
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P57  
 * @author: penggang
 * @date:   2018年1月29日 下午10:41:38   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();    //对象1
		HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();	//对象2

		ThreadA athread = new ThreadA(numRef1);					//线程1访问对象1
		athread.start();

		ThreadB bthread = new ThreadB(numRef2);					//线程2访问对象2
		bthread.start();
	}
}
