/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread.java   
 * @Package cn.com.study.multithread.base.startThread   
 * @author: penggang
 * @date:   2018��1��28�� ����9:05:57   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.startThread;

/**  
 * @ClassName:  MyThread   
 * @Description:��֤Thread�е�start()  
 * @author: penggang
 * @date:   2018��1��28�� ����9:05:57   
 * 
 **/
public class MyThread extends Thread{
	private int i;

	public MyThread(int i) {
		super();
		this.i = i;
	}

	public void run() {
		System.out.println(i);
	}
}
