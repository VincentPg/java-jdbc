/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadA.java   
 * @Package cn.com.study.multithread.synchronize.twoObject   
 * @author: penggang
 * @date:   2018��1��29�� ����11:04:13   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.twoObject;

/**  
 * @ClassName:  ThreadA   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��29�� ����11:04:13   
 * 
 **/
public class ThreadA extends Thread{
	private HasSelfPrivateNum numRef;

	public ThreadA(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	@Override
	public void run() {
		super.run();
		numRef.addI("a");
	}
}
