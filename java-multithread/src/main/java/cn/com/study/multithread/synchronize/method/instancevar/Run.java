/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.instancevar   
 * @author: penggang
 * @date:   2018年1月28日 下午10:44:22   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.instancevar;

import cn.com.study.multithread.synchronize.method.functionvar.HasSelfPrivateNum;
import cn.com.study.multithread.synchronize.method.functionvar.ThreadA;
import cn.com.study.multithread.synchronize.method.functionvar.ThreadB;

/**  
 * 实例变量非线程安全。
 * 解决方法：
 * 	在类HasSelfPrivateNum中被多个线程访问的方法添加关键字synchronized修饰
 * 
 * 结论：在两个线程访问同一个对象中的同步方法(用关键字synchronized修饰)时一定是安全的。
 * 线程安全<=>同步、顺序调用。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P55 
 * @author: penggang
 * @date:   2018年1月28日 下午10:44:22   
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
