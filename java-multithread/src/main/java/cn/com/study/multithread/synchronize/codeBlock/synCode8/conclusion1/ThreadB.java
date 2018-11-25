/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadB.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1   
 * @author: penggang
 * @date:   2018年1月31日 下午9:15:58   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1;

/**  
 * @ClassName:  ThreadB   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午9:15:58   
 * 
 **/
public class ThreadB extends Thread{

	private Service service;
	private MyObject object;

	public ThreadB(Service service, MyObject object) {
		super();
		this.service = service;
		this.object = object;
	}

	@Override
	public void run(){
		super.run();
		service.testMethod1(object);
	}
}
