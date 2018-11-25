/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Exchanger.Exchanger_2   
 * @author: penggang
 * @date:   2018年2月16日 下午12:52:28   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.threadFramework.Exchanger.Exchanger_2;

import java.util.concurrent.Exchanger;

/**  
 * @ClassName:  Run   
 * @Description:Java并发编程核心方法与框架 --高洪岩 P32   
 * @author: penggang
 * @date:   2018年2月16日 下午12:52:28   
 * 
 **/
public class Run {

	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		ThreadA a = new ThreadA(exchanger);
		ThreadB b = new ThreadB(exchanger);
		a.start();
		b.start();
	}
}
