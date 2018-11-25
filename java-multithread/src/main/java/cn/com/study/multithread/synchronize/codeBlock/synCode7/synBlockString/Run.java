/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString   
 * @author: penggang
 * @date:   2018年1月30日 下午11:37:17   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString;

/**  
 * 1、三种同步思路：
 * synchronized同步方法作用：
 * 		(1)对其它synchronized同步方法或synchronized(this)同步代码块调用呈阻塞状态。
 * 		(2)同一时间，只有一个线程可以执行synchronized同步方法中的代码。
 * synchronized(this)同步代码块作用：
 *  	(1)对其它synchronized同步方法或synchronized(this)同步代码块调用呈阻塞状态。
 * 		(2)同一时间，只有一个线程可以执行synchronized(this)同步代码块中的代码。
 * synchronized(非this对象)同步代码块作用：
 * 		(1)在多个线程持有"对象监视器"为同一个对象的前提下，同一时间下只有一个线程可以执行
 * synchronized(非this对象)同步代码块中的代码。
 * 		(2)当持有"对象监视器"为同一个对象的前提下，同一时间只有一个线程可以执行synchronized(非this对象)
 * 同步代码块中的代码。
 * 2、三种思路优缺点：
 * 	   如果一个类中有很多个synchronized方法,这时能实现同步，但会受到阻塞，影响运行效率；
 * 	   如果使用同步代码块锁非this对象，则synchronized(非this)代码块中的程序与同步方法是异步的，
 * 不与其它锁this同步方法争抢this锁，则可以提高运行效率。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P82  
 * @author: penggang
 * @date:   2018年1月30日 下午11:37:17   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
