/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  RUn.java   
 * @Package cn.com.study.multithread.communication.wait_notify_lock.ReleaseLock   
 * @author: penggang
 * @date:   2018年2月1日 下午12:46:33   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify_lock.ReleaseLock;

/**  
 * 方法wait()自动释放锁
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P143    
 * @author: penggang
 * @date:   2018年2月1日 下午12:46:33   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		Object lock = new Object();

		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

	}
}
