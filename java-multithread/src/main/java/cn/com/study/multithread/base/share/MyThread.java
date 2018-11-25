/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread.java   
 * @Package cn.com.study.multithread.base.share   
 * @author: penggang
 * @date:   2018年1月28日 下午9:27:26   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.share;

/**  
 * @ClassName:  MyThread   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月28日 下午9:27:26   
 * 
 **/
public class MyThread extends Thread {
	private int count=5;
	
	synchronized public void run() {
		super.run();
			count--;
			System.out.println("由 "+this.currentThread().getName()+" 计算，count="+count);
	}
}
