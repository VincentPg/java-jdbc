/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.startThread   
 * @author: penggang
 * @date:   2018年1月28日 下午9:07:23   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.startThread;

/**  
 *  对比代码顺序和执行结果
 *  执行start()的顺序并不代表线程的启动顺序，而是通知"线程规划器"，线程执行顺序由CPU调度决定的。
 * @ClassName:  Run   
 * @Description: Java多线程编程核心技术 --高洪岩 P7
 * 			验证Thread的start()的作用 
 * @author: penggang
 * @date:   2018年1月28日 下午9:07:23   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyThread t11 = new MyThread(1);
		MyThread t12 = new MyThread(2);
		MyThread t13 = new MyThread(3);
		MyThread t14 = new MyThread(4);
		MyThread t15 = new MyThread(5);
		MyThread t16 = new MyThread(6);
		MyThread t17 = new MyThread(7);
		MyThread t18 = new MyThread(8);
		MyThread t19 = new MyThread(9);
		MyThread t110 = new MyThread(10);
		MyThread t111 = new MyThread(11);
		MyThread t112 = new MyThread(12);
		MyThread t113 = new MyThread(13);

		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		t110.start();
		t111.start();
		t112.start();
		t113.start();
	}
}
