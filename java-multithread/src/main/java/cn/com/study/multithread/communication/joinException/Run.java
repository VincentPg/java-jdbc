/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.joinException   
 * @author: penggang
 * @date:   2018年2月7日 上午12:02:26   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.joinException;

/**  
 *  方法join与异常
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P181   
 * @author: penggang
 * @date:   2018年2月7日 上午12:02:26   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		try {
			ThreadB b = new ThreadB();
			b.start();

			Thread.sleep(500);

			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
