/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadA.java   
 * @Package cn.com.study.multithread.synchronize.instancevar   
 * @author: penggang
 * @date:   2018年1月28日 下午10:43:17   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.instancevar;

/**  
 * @ClassName:  ThreadA   
 * @Description:
 * @author: penggang
 * @date:   2018年1月28日 下午10:43:17   
 * 
 **/
public class ThreadA extends Thread{

	private HasSelfPrivateNum numRef;

	public ThreadA(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	public void run() {
		super.run();
		numRef.addI("a");
	}
}
