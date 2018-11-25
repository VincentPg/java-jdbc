/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.producers_consumers.four   
 * @author: penggang
 * @date:   2018年2月6日 下午10:37:41   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.producers_consumers.four;

/**  
 * 一生产与一消费者：操作栈
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P164 
 * @author: penggang
 * @date:   2018年2月6日 下午10:37:41   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		P p = new P(myStack);
		C r = new C(myStack);

		P_Thread pThread = new P_Thread(p);
		C_Thread rThread = new C_Thread(r);
		pThread.start();
		rThread.start();
	}
}
