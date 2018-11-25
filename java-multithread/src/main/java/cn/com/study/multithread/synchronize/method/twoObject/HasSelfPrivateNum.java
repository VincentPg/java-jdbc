/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  HasSelfPrivateNum.java   
 * @Package cn.com.study.multithread.synchronize.twoObject   
 * @author: penggang
 * @date:   2018年1月29日 下午11:01:05   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.twoObject;

/**  
 * @ClassName:  HasSelfPrivateNum   
 * @Description: 
 * @author: penggang
 * @date:   2018年1月29日 下午11:01:05   
 * 
 **/
public class HasSelfPrivateNum {
	private int num = 0;

	synchronized public void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(username + " num=" + num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
