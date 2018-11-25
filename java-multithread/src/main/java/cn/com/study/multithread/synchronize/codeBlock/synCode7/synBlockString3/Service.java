/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString3   
 * @author: penggang
 * @date:   2018年1月31日 上午9:41:41   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString3;

/**  
 * @ClassName:  Service   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 上午9:41:41   
 * 
 **/
public class Service {
	private String anyString = new String();

	public void a() {
		try {
			synchronized (anyString) {   //此处对象监视器监视的是对象anyString。
				System.out.println("a begin");
				Thread.sleep(3000);
				System.out.println("a   end");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void b() {	//此处对象监视器监视的是Service的实例对象。
		System.out.println("b begin");
		System.out.println("b   end");
	}
}
