/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4   
 * @author: penggang
 * @date:   2018年1月31日 下午12:47:20   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4;

/**  
 * 多个线程调用同一个方法是随机的。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P87  
 * @author: penggang
 * @date:   2018年1月31日 下午12:47:20   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyList mylist = new MyList();

		MyThreadA a = new MyThreadA(mylist);
		a.setName("A");
		a.start();

		MyThreadB b = new MyThreadB(mylist);
		b.setName("B");
		b.start();
	}
}
