/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  CountOperate.java   
 * @Package cn.com.study.multithread.base.currentThreadExt   
 * @author: penggang
 * @date:   2018年1月28日 下午10:09:35   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.currentThreadExt;

/**  
 * @ClassName:  CountOperate   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月28日 下午10:09:35   
 * 
 **/
public class CountOperate extends Thread{
	
	public CountOperate() {
		System.out.println("CountOperate---begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("CountOperate---end");
	}

	@Override
	public void run() {
		System.out.println("run---begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("run---end");
	}
}
