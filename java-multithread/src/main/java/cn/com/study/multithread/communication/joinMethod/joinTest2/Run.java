/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.joinMethod.joinTest2   
 * @author: penggang
 * @date:   2018年2月6日 下午11:59:24   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.joinMethod.joinTest2;

/**  
 * join方法解决问题
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P180   
 * @author: penggang
 * @date:   2018年2月6日 下午11:59:24   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();

			System.out.println("我想当threadTest对象执行完毕后我再执行，我做到了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
