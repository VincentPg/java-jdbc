/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread.java   
 * @Package cn.com.study.multithread.base.currentThread   
 * @author: penggang
 * @date:   2018��1��28�� ����9:58:09   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.currentThread;

/**  
 * @ClassName:  MyThread   
 * @Description:   
 * @author: penggang
 * @date:   2018��1��28�� ����9:58:09   
 * 
 **/
public class MyThread extends Thread{
	public MyThread() {
		System.out.println("���췽���Ĵ�ӡ��" + Thread.currentThread().getName());
	}

	public void run() {
		System.out.println("run�����Ĵ�ӡ��" + Thread.currentThread().getName());
	}
}
