/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.twoMethod   
 * @author: penggang
 * @date:   2018年2月16日 上午11:01:17   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Semaphore.twoMethod;

/**  
 * @ClassName:  Run   
 * @Description:Java并发编程核心方法与框架 --高洪岩 P12   
 * @author: penggang
 * @date:   2018年2月16日 上午11:01:17   
 * 
 **/
public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();

		MyThread firstThread = new MyThread(service);
		firstThread.start();

		MyThread[] threadArray = new MyThread[4];
		for (int i = 0; i < 4; i++) {
			threadArray[i] = new MyThread(service);
			threadArray[i].start();
		}

	}

}
