/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyRunnable.java   
 * @Package cn.com.study.multithread.base.createThread2   
 * @author: penggang
 * @date:   2018年1月28日 下午9:15:05   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.createThread2;

/**  
 * @ClassName:  MyRunnable   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月28日 下午9:15:05   
 * 
 **/
public class MyRunnable implements Runnable{

	/**   
	 * <p>Title: run</p>   
	 * <p>Description: </p>      
	 * @see java.lang.Runnable#run()   
	 */
	public void run() {
		System.out.println(Thread.currentThread().getName()+"运行中!");
	}

}
