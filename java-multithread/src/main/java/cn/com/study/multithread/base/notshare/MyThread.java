/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread.java   
 * @Package cn.com.study.multithread.base.notshare   
 * @author: penggang
 * @date:   2018��1��28�� ����9:22:58   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.notshare;

/**  
 * @ClassName:  MyThread   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��28�� ����9:22:58   
 * 
 **/
public class MyThread extends Thread{
	private int count = 5;

	public MyThread(String name) {
		super();
		this.setName(name);
	}

	public void run() {
		super.run();
		while (count > 0) {
			count--;
			System.out.println("�� " + this.currentThread().getName()
					+ " ���㣬count=" + count);
		}
	}
}
