/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.lock.reentrantLock.test1   
 * @author: penggang
 * @date:   2018年2月11日 下午3:40:14   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.lock.reentrantLock.test1;

/**  
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P200 
 * @author: penggang
 * @date:   2018年2月11日 下午3:40:14   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		MyService service = new MyService();

		MyThread a1 = new MyThread(service);
		MyThread a2 = new MyThread(service);
		MyThread a3 = new MyThread(service);
		MyThread a4 = new MyThread(service);
		MyThread a5 = new MyThread(service);

		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();

	}

}
