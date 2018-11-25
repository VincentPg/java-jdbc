/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.Pool_List   
 * @author: penggang
 * @date:   2018年2月16日 下午12:22:57   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Semaphore.Pool_List;

/**  
 * @ClassName:  Run   
 * @Description:Java并发编程核心方法与框架 --高洪岩 P23  
 * @author: penggang
 * @date:   2018年2月16日 下午12:22:57   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {

		ListPool pool = new ListPool();

		MyThread[] threadArray = new MyThread[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(pool);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}

	}
}
