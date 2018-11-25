/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.volatiles.for1   
 * @author: penggang
 * @date:   2018年1月31日 下午9:38:46   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.volatiles.for1;

/**  
 * 关键字volatile与死循环
 * 
 * 死循环的根本原因：
 * 	main线程一直在处理while()循环，导致程序不能继续执行后面的代码。
 * 解决思路：多线程技术。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P119  
 * @author: penggang
 * @date:   2018年1月31日 下午9:38:46   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("我要停止它！stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
