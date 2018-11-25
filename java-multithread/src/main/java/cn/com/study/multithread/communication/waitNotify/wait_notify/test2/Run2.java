/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run2.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test2   
 * @author: penggang
 * @date:   2018��1��31�� ����10:56:55   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test2;

/**  
 * wait()�����ã�
 * 	  Object��ķ���������ǰ�߳�����"Ԥִ�ж���"�У�������wait()���ڵĴ����д�ֹͣ
 * ִ�У�ֱ���ӵ�֪ͨ���ж�Ϊֹ��
 * wait()��ʹ��˼·��
 * (1)�ڵ���wait()֮ǰ����ǰ�̱߳����øö���Ķ��󼶱���(��ֻ����ͬ��������ͬ�����е���wait()����)
 * (2)ִ��wait()�����󣬵�ǰ�߳��ͷ�����
 * (3)�ڴ�wait()���ؼ���ִ������Ĵ���ǰ����ǰ�߳��������߳̾������»�ȡ����
 * ע�⣺
 * 	 �������wait()����ʱû�г����ʵ����������׳��쳣java.lang.IllegalMonitorStateException
 * @ClassName:  Run2   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P137  
 * @author: penggang
 * @date:   2018��1��31�� ����10:56:55   
 * 
 **/
public class Run2 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn����");
			synchronized (lock) {    // �����������synchronized(��this����x)
				System.out.println("syn��һ��");
				lock.wait();  //main�߳�ִ�е����д����ȴ���ֹͣ��ǰ,�������������С����ͷŶ�����lock�����ź������߳̾������»�ȡ����
				System.out.println("wait�µĴ��룡");
			}
			System.out.println("syn����Ĵ���");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
