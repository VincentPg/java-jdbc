/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  HasSelfPrivateNum.java   
 * @Package cn.com.study.multithread.synchronize.functionvar   
 * @author: penggang
 * @date:   2018年1月28日 下午10:20:39   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.functionvar;

/**  
 * @ClassName:  HasSelfPrivateNum   
 * @Description:  
 * @author: penggang
 * @date:   2018年1月28日 下午10:20:39   
 * 
 **/
public class HasSelfPrivateNum {
	
	public void addI(String username) {
		try {
			int num = 0;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
