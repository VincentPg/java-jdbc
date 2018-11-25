/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread.java   
 * @Package cn.com.study.multithread.base.startThread   
 * @author: penggang
 * @date:   2018年1月28日 下午9:05:57   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.startThread;

/**  
 * @ClassName:  MyThread   
 * @Description:验证Thread中的start()  
 * @author: penggang
 * @date:   2018年1月28日 下午9:05:57   
 * 
 **/
public class MyThread extends Thread{
	private int i;

	public MyThread(int i) {
		super();
		this.i = i;
	}

	public void run() {
		System.out.println(i);
	}
}
