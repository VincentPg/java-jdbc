/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  PublicVar.java   
 * @Package cn.com.study.multithread.synchronize.dirtyRead   
 * @author: penggang
 * @date:   2018年1月30日 上午12:06:16   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.method.dirtyRead;

/**  
 * @ClassName:  PublicVar   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月30日 上午12:06:16   
 * 
 **/
public class PublicVar {
	
	public String username = "A";
	public String password = "AA";

	synchronized public void setValue(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;

			System.out.println("setValue method thread name="
					+ Thread.currentThread().getName() + " username="
					+ username + " password=" + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void getValue() {
		System.out.println("getValue method thread name="
				+ Thread.currentThread().getName() + " username=" + username
				+ " password=" + password);
	}
}
