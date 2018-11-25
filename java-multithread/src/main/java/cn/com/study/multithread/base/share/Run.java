/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.share   
 * @author: penggang
 * @date:   2018��1��28�� ����9:28:40   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.share;

/**  
 * �̹߳������ݣ�����̷߳���ͬһ��������
 * ע�⣺
 * 	������߳�����̷߳�����run()ǰ���Ϲؼ���synchronized�����᲻һ����
 * 
 * ���̰߳�ȫ������̶߳�ͬһ�������е�ͬһ��ʵ���������в���ʱ�����ֵ�����ġ�ֵ��ͬ���������
 * ����Ӱ������ִ�����̡�
 * 
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P10 
 * @author: penggang
 * @date:   2018��1��28�� ����9:28:40   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyThread mythread=new MyThread();  // һ���̶߳���
		//����һ���̶߳��󴴽�����̡߳�
		Thread a=new Thread(mythread,"A");
		Thread b=new Thread(mythread,"B");
		Thread c=new Thread(mythread,"C");
		Thread d=new Thread(mythread,"D");
		Thread e=new Thread(mythread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
/**
 * ����synchronized �ؼ��ֿ��ܵĽ��
  	�� A ���㣬count=3
	�� E ���㣬count=0
	�� C ���㣬count=1
	�� B ���㣬count=3
	�� D ���㣬count=1
 *  ��synchronized �ؼ��ֿ��ܵĽ��
 	�� A ���㣬count=4
	�� E ���㣬count=3
	�� D ���㣬count=2
	�� C ���㣬count=1
	�� B ���㣬count=0
 */
