/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1   
 * @author: penggang
 * @date:   2018年1月31日 下午9:15:02   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1;

/**  
 * @ClassName:  Service   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午9:15:02   
 * 
 **/
public class Service {
	public void testMethod1(MyObject object) {
		synchronized (object) {
			try {
				System.out.println("testMethod1 ____getLock time="
						+ System.currentTimeMillis() + " run ThreadName="
						+ Thread.currentThread().getName());
				Thread.sleep(2000);
				System.out.println("testMethod1 releaseLock time="
						+ System.currentTimeMillis() + " run ThreadName="
						+ Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
