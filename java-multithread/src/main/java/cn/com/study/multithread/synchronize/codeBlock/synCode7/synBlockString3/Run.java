/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString3   
 * @author: penggang
 * @date:   2018年1月31日 上午9:40:32   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString3;

/**  
 * 对象监视器不同，运行结果是异步的。
 * 	同步代码块放在非同步synchronized方法中进行声明，并不能保证调用方法的线程的执行
 * 同步/顺序性，即线程调用方法的顺序是无序的。
 * 
 * synchronized(非this对象x)同步代码块可以解决"脏读"问题。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P85   
 * @author: penggang
 * @date:   2018年1月31日 上午9:40:32   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}
}
