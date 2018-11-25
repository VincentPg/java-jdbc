/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadB.java   
 * @Package cn.com.study.threadFramework.Exchanger.Exchanger_2   
 * @author: penggang
 * @date:   2018年2月16日 下午12:53:53   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Exchanger.Exchanger_2;

import java.util.concurrent.Exchanger;

/**  
 * @ClassName:  ThreadB   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年2月16日 下午12:53:53   
 * 
 **/
public class ThreadB extends Thread{
	
	private Exchanger<String> exchanger;

	public ThreadB(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println("在线程B中得到线程A的值=" + exchanger.exchange("中国人B"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
