/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test1   
 * @author: penggang
 * @date:   2018年1月31日 下午10:21:08   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test1;

/**  
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P133    
 * @author: penggang
 * @date:   2018年1月31日 下午10:21:08   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyList service = new MyList();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}
}
