/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.randomThread   
 * @author: penggang
 * @date:   2018��1��28�� ����8:54:05   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.randomThread;

/**  
 * (1)����start������
 *     ֪ͨ"�̹߳滮��"���߳��Ѿ�׼���������ȴ������̶߳����
 * run()������ʹ���̵߳õ����У������̣߳����С��첽ִ�С���Ч��
 * (2)�����߳���д��run����(����thread.run()):
 *     ���̶߳��󲢲�����"�̹߳滮��"�����д���������main���߳�����
 *     ��run()����������run()�����еĴ���ִ�����ſ���ִ�к���Ĵ��롣
 *     ���С�ͬ��ִ�С���Ч����
 * @ClassName:  Run   
 * @Description:  Java���̱߳�̺��ļ��� --�ߺ��� P6 
 * 			�߳�����ԣ�CPUִ���߳̾��в�ȷ���ԡ�   
 * @author: penggang
 * @date:   2018��1��28�� ����8:54:05   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setName("myThread");
			thread.start();
	
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				
					Thread.sleep(time);
				
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
