/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadA.java   
 * @Package cn.com.study.multithread.synchronize.instancevar   
 * @author: penggang
 * @date:   2018��1��28�� ����10:43:17   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.instancevar;

/**  
 * @ClassName:  ThreadA   
 * @Description:
 * @author: penggang
 * @date:   2018��1��28�� ����10:43:17   
 * 
 **/
public class ThreadA extends Thread{

	private HasSelfPrivateNum numRef;

	public ThreadA(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	public void run() {
		super.run();
		numRef.addI("a");
	}
}
