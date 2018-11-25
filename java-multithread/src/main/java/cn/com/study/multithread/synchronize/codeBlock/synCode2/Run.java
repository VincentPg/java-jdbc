/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode2   
 * @author: penggang
 * @date:   2018年1月30日 下午10:41:18   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode2;

/**  
 * 一半异步，一半同步：
 * 	不在synchronized块中就是异步执行，在synchronized块中就是同步执行。
 * 
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P76   
 * @author: penggang
 * @date:   2018年1月30日 下午10:41:18   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		Task task = new Task();

		MyThread1 thread1 = new MyThread1(task);
		thread1.start();

		MyThread2 thread2 = new MyThread2(task);
		thread2.start();
	}
}
