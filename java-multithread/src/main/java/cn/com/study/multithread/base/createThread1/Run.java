/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.createThread1   
 * @author: penggang
 * @date:   2018��1��28�� ����8:44:20   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.createThread1;

/**  
 * ע��۲�ִ�н���ʹ���˳��һ�¡�
 * 	�̵߳��õ�����ԡ�
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P5
 * 				 �̳�Thread�������̡߳�
 * @author: penggang
 * @date:   2018��1��28�� ����8:44:20   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		System.out.println("���н�����");
	}
}
/**
 * 
 * ���н�����
 *current Thread:Thread-0
 * 
 */
