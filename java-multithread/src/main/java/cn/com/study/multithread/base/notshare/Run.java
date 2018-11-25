/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.notshare   
 * @author: penggang
 * @date:   2018年1月28日 下午9:23:23   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.notshare;

/**  
 * 线程不共享数据。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P9 
 * @author: penggang
 * @date:   2018年1月28日 下午9:23:23   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		//此处创建了三个线程对象，各自访问自己的实例变量count。  即一线程一份数据
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
	}
}
