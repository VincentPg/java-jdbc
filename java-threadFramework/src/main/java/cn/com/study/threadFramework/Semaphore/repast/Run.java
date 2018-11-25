/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.repast   
 * @author: penggang
 * @date:   2018年2月16日 下午12:37:29   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Semaphore.repast;

/**  
 * @ClassName:  Run   
 * @Description:Java并发编程核心方法与框架 --高洪岩 P25 
 * @author: penggang
 * @date:   2018年2月16日 下午12:37:29   
 * 
 **/
public class Run {

	public static void main(String[] args) throws InterruptedException {
		RepastService service = new RepastService();
		ThreadP[] arrayP = new ThreadP[60];
		ThreadC[] arrayC = new ThreadC[60];
		for (int i = 0; i < 60; i++) {
			arrayP[i] = new ThreadP(service);
			arrayC[i] = new ThreadC(service);
		}
		Thread.sleep(2000);
		for (int i = 0; i < 60; i++) {
			arrayP[i].start();
			arrayC[i].start();
		}
	}
}
