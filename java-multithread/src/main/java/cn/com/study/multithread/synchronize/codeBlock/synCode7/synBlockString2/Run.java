/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString2   
 * @author: penggang
 * @date:   2018年1月31日 上午9:29:49   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString2;


/**  
 * synchronized(非this对象)中对象监视器必须是同一个对象。如果不是同一个对象监视器，
 * 运行的结果则是异步调用。
 * 
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P84   
 * @author: penggang
 * @date:   2018年1月31日 上午9:29:49   
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
