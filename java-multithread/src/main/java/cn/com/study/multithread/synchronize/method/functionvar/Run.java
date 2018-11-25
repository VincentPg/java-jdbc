/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.functionvar   
 * @author: penggang
 * @date:   2018年1月28日 下午10:24:23   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.functionvar;

/**  
 * 方法中的变量不存在非线程安全问题，永远是线程安全的。
 * 从jvm内存模型的角度来分析。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P53  
 * @author: penggang
 * @date:   2018年1月28日 下午10:24:23   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();       //一个对象

		ThreadA athread = new ThreadA(numRef);					  //一个线程
		athread.start();

		ThreadB bthread = new ThreadB(numRef);					  //一个线程
		bthread.start();
	}
}
