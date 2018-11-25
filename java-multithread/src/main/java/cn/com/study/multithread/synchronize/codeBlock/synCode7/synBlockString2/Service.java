/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString   
 * @author: penggang
 * @date:   2018年1月30日 下午11:38:25   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString2;

/**  
 * @ClassName:  Service   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月30日 下午11:38:25   
 * 
 **/
public class Service {
	
	private String usernameParam;
	private String passwordParam;

	public void setUsernamePassword(String username, String password) {
		try {
			String anyString = new String();      //这样的效果能让每个线程获取的不是同一个对象锁，这样多个线程访问则会是异步的效果。有点局部锁的意思。
			synchronized (anyString) {
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "进入同步块");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("线程名称为：" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "离开同步块");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
