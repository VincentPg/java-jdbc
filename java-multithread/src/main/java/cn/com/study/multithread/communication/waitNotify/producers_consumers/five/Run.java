/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.producers_consumers.five   
 * @author: penggang
 * @date:   2018��2��6�� ����10:45:54   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.producers_consumers.five;

/**  
 * һ������������ߣ�����ջ ���wait�����ı����
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P166 
 * @author: penggang
 * @date:   2018��2��6�� ����10:45:54   
 * 
 **/
public class Run {
	public static void main(String[] args) throws InterruptedException {
		MyStack myStack = new MyStack();

		P p = new P(myStack);

		C r1 = new C(myStack);
		C r2 = new C(myStack);
		C r3 = new C(myStack);
		C r4 = new C(myStack);
		C r5 = new C(myStack);

		P_Thread pThread = new P_Thread(p);
		pThread.start();

		C_Thread cThread1 = new C_Thread(r1);
		C_Thread cThread2 = new C_Thread(r2);
		C_Thread cThread3 = new C_Thread(r3);
		C_Thread cThread4 = new C_Thread(r4);
		C_Thread cThread5 = new C_Thread(r5);
		cThread1.start();
		cThread2.start();
		cThread3.start();
		cThread4.start();
		cThread5.start();
	}
}
