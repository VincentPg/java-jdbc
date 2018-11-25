/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.lockObject   
 * @author: penggang
 * @date:   2018年1月29日 下午11:28:19   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.lockObject;

/**  
 * 类MyObject的方法加上synchronized和不加的区别：
 * 		加关键字后：同步执行
 * 		不加关键字：异步执行
 * 结论：
 * 	(1)调用关键字synchronized声明的方法一定是排队运行。
 *  (2)只有共享资源的读写访问才需要同步化，如果不是共享资源，那么根本没有同步的必要。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P59  
 * @author: penggang
 * @date:   2018年1月29日 下午11:28:19   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(object);
		a.setName("A");
		ThreadB b = new ThreadB(object);
		b.setName("B");

		a.start();
		b.start();
	}
}
