/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.lock.reentrantLock.testCondition   
 * @author: penggang
 * @date:   2018年2月11日 下午5:31:05   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.lock.reentrantLock.testCondition;

/**  
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P202  
 * @author: penggang
 * @date:   2018年2月11日 下午5:31:05   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.start();

	}
}
