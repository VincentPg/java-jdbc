/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.currentThread   
 * @author: penggang
 * @date:   2018年1月28日 下午9:59:28   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.currentThread;

/**  
 * currentThread():返回代码段正在被哪个线程调用的信息。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P16 
 * @author: penggang
 * @date:   2018年1月28日 下午9:59:28   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();		//main方法调用
		mythread.start();						//自建线程调用
		mythread.run();    						//main方法调用
	}
}
