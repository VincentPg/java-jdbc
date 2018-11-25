/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.dirtyRead   
 * @author: penggang
 * @date:   2018年1月30日 上午12:05:16   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.dirtyRead;

/**  
 * 脏读：赋值的方法是同步的，取值的方法没有同步，当取值的时候，该值已经被其它线程修改了。
 * 
 * 脏读解决思路：synchronized。
 * 
 * 结论：
 * (1)当A线程调用任意对象的同步方法X(由synchronized修饰)时，A线程获得该对象的锁，其它线程必须
 * 等A线程执行完毕后才可以调用X方法，但是其它线程可以调用未同步的方法(没有synchronized修饰的)
 * (2)当A线程调用任意对象的同步方法X时(由synchronized修饰)时，A线程获得该对象的锁，其它线程必须
 * 等A线程执行完毕后才可以调用X方法，如果线程B调用声明了synchronized关键字的非X方法时，必须等A线程
 * 将X方法执行完(释放对象锁)后才可以调用。这样就解决了脏读现象。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P63
 * @author: penggang
 * @date:   2018年1月30日 上午12:05:16   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();

			Thread.sleep(200);// 打印结果受此值大小影响

			publicVarRef.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
