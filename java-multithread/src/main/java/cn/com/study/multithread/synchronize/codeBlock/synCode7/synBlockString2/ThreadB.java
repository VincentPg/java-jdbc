/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadB.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString   
 * @author: penggang
 * @date:   2018年1月30日 下午11:53:56   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString2;

/**  
 * @ClassName:  ThreadB   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月30日 下午11:53:56   
 * 
 **/
public class ThreadB extends Thread{

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.setUsernamePassword("b", "bb");

	}
}
