/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.startThread   
 * @author: penggang
 * @date:   2018��1��28�� ����9:07:23   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.startThread;

/**  
 *  �Աȴ���˳���ִ�н��
 *  ִ��start()��˳�򲢲������̵߳�����˳�򣬶���֪ͨ"�̹߳滮��"���߳�ִ��˳����CPU���Ⱦ����ġ�
 * @ClassName:  Run   
 * @Description: Java���̱߳�̺��ļ��� --�ߺ��� P7
 * 			��֤Thread��start()������ 
 * @author: penggang
 * @date:   2018��1��28�� ����9:07:23   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyThread t11 = new MyThread(1);
		MyThread t12 = new MyThread(2);
		MyThread t13 = new MyThread(3);
		MyThread t14 = new MyThread(4);
		MyThread t15 = new MyThread(5);
		MyThread t16 = new MyThread(6);
		MyThread t17 = new MyThread(7);
		MyThread t18 = new MyThread(8);
		MyThread t19 = new MyThread(9);
		MyThread t110 = new MyThread(10);
		MyThread t111 = new MyThread(11);
		MyThread t112 = new MyThread(12);
		MyThread t113 = new MyThread(13);

		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		t16.start();
		t17.start();
		t18.start();
		t19.start();
		t110.start();
		t111.start();
		t112.start();
		t113.start();
	}
}
