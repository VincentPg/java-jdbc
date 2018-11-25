/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Task.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode3   
 * @author: penggang
 * @date:   2018年1月30日 下午11:07:28   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode3;

/**  
 * @ClassName:  Task   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月30日 下午11:07:28   
 * 
 **/
public class Task {

	synchronized public void otherMethod() {
		System.out.println("------------------------run--otherMethod");
	}

	public void doLongTimeTask() {
		synchronized (this) {
			for (int i = 0; i < 10000; i++) {
				System.out.println("synchronized threadName="
						+ Thread.currentThread().getName() + " i=" + (i + 1));
			}
		}

	}
}
