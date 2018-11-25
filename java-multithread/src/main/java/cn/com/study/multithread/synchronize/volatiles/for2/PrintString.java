/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  PrintString.java   
 * @Package cn.com.study.multithread.synchronize.volatiles.for2   
 * @author: penggang
 * @date:   2018年1月31日 下午9:44:52   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.volatiles.for2;

/**  
 * @ClassName:  PrintString   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午9:44:52   
 * 
 **/
public class PrintString implements Runnable{
	
	private boolean isContinuePrint = true;

	public boolean isContinuePrint() {
		return isContinuePrint;
	}

	public void setContinuePrint(boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}

	public void printStringMethod() {
		try {
			while (isContinuePrint == true) {
				System.out.println("run printStringMethod threadName="
						+ Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		printStringMethod();
	}
}
