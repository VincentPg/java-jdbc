/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread2.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5   
 * @author: penggang
 * @date:   2018年1月31日 下午12:54:34   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5;

/**  
 * @ClassName:  MyThread2   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午12:54:34   
 * 
 **/
public class MyThread2 extends Thread{

	private MyOneList list;

	public MyThread2(MyOneList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "B");
	}
}
