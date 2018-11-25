/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run2.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1   
 * @author: penggang
 * @date:   2018年1月31日 下午9:17:27   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1;

/**  
 * synchronized(非this对象x):将x对象本身作为"对象监视器"
 * 
 * 结论：
 * (1)当多个线程同时执行synchronized(x){}同步代码块时呈同步效果。
 * (2)当其它线程执行x对象中synchronized同步方法时呈同步效果。
 * (3)当其它线程执行x对象方法里面的synchronized(this)代码块时也呈现同步效果。
 * @ClassName:  Run2   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午9:17:27   
 * 
 **/
public class Run2 {
	public static void main(String[] args) {
		Service service = new Service();
		MyObject object1 = new MyObject();
		MyObject object2 = new MyObject();

		ThreadA a = new ThreadA(service, object1);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service, object2);
		b.setName("b");
		b.start();
	}
}
