/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread.java   
 * @Package cn.com.study.multithread.base.randomThread   
 * @author: penggang
 * @date:   2018��1��28�� ����8:52:58   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.randomThread;

/**  
 * @ClassName:  MyThread   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��28�� ����8:52:58   
 * 
 **/
public class MyThread extends Thread{
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("run=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
