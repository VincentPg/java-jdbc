/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadB.java   
 * @Package cn.com.study.multithread.synchronize.functionvar   
 * @author: penggang
 * @date:   2018��1��28�� ����10:23:44   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.functionvar;

/**  
 * @ClassName:  ThreadB   
 * @Description:  
 * @author: penggang
 * @date:   2018��1��28�� ����10:23:44   
 * 
 **/
public class ThreadB extends Thread{
	
	private HasSelfPrivateNum numRef;

	public ThreadB(HasSelfPrivateNum numRef) {
		super();
		this.numRef = numRef;
	}

	public void run() {
		super.run();
		numRef.addI("b");
	}

}
