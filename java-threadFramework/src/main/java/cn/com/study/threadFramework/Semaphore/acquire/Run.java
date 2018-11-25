/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.acquire   
 * @author: penggang
 * @date:   2018年2月15日 下午7:11:43   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Semaphore.acquire;

/**  
 * @ClassName:  Run   
 * @Description:Java并发编程核心方法与框架 --高洪岩 P5   
 * @author: penggang
 * @date:   2018年2月15日 下午7:11:43   
 * 
 **/
public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();

		ThreadA[] a = new ThreadA[10];
		for (int i = 0; i < 10; i++) {
			a[i] = new ThreadA(service);
			a[i].start();
		}

	}
}
