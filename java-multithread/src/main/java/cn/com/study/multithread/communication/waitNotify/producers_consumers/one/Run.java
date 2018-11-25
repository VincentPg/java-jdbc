/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.producers_consumers.one   
 * @author: penggang
 * @date:   2018年2月1日 下午9:15:35   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.producers_consumers.one;

/**  
 * 一生产与一消费：操作值
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P158   
 * @author: penggang
 * @date:   2018年2月1日 下午9:15:35   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);

		ThreadP pThread = new ThreadP(p);
		ThreadC rThread = new ThreadC(r);

		pThread.start();
		rThread.start();
	}
}
