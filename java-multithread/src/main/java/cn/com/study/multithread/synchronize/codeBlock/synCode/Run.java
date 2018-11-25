/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode   
 * @author: penggang
 * @date:   2018年1月30日 下午10:18:09   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode;

/**  
 * synchronized同步代码块：
 * 	当两个并发线程访问同一个对象object中的synchronized(this)同步代码块时，一段
 * 时间内只能有一个线程被执行，另一个线程必须等待当前线程执行完成这个代码块以后
 * 才能执行该代码块。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P74  
 * @author: penggang
 * @date:   2018年1月30日 下午10:18:09   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		
		ObjectService service = new ObjectService();

		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}
}
