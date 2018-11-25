/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.producers_consumers.seven   
 * @author: penggang
 * @date:   2018年2月6日 下午10:52:23   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.producers_consumers.seven;

/**  
 * 多生产与多消费：操作栈
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P170
 * @author: penggang
 * @date:   2018年2月6日 下午10:52:23   
 * 
 **/
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyStack myStack = new MyStack();

		P p1 = new P(myStack);
		P p2 = new P(myStack);
		P p3 = new P(myStack);
		P p4 = new P(myStack);
		P p5 = new P(myStack);
		P p6 = new P(myStack);

		P_Thread pThread1 = new P_Thread(p1);
		P_Thread pThread2 = new P_Thread(p2);
		P_Thread pThread3 = new P_Thread(p3);
		P_Thread pThread4 = new P_Thread(p4);
		P_Thread pThread5 = new P_Thread(p5);
		P_Thread pThread6 = new P_Thread(p6);
		pThread1.start();
		pThread2.start();
		pThread3.start();
		pThread4.start();
		pThread5.start();
		pThread6.start();

		C r1 = new C(myStack);
		C r2 = new C(myStack);
		C r3 = new C(myStack);
		C r4 = new C(myStack);
		C r5 = new C(myStack);
		C r6 = new C(myStack);
		C r7 = new C(myStack);
		C r8 = new C(myStack);

		C_Thread cThread1 = new C_Thread(r1);
		C_Thread cThread2 = new C_Thread(r2);
		C_Thread cThread3 = new C_Thread(r3);
		C_Thread cThread4 = new C_Thread(r4);
		C_Thread cThread5 = new C_Thread(r5);
		C_Thread cThread6 = new C_Thread(r6);
		C_Thread cThread7 = new C_Thread(r7);
		C_Thread cThread8 = new C_Thread(r8);

		cThread1.start();
		cThread2.start();
		cThread3.start();
		cThread4.start();
		cThread5.start();
		cThread6.start();
		cThread7.start();
		cThread8.start();

	}
}
