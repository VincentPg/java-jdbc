/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test3   
 * @author: penggang
 * @date:   2018��1��31�� ����11:11:09   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test3;

/**  
 * ���ۣ�waitʹ�߳�ֹͣ��Ů�ԣ���notifyʹֹͣ���̼߳������С�
 * 
 * notify()���ã�
 * 		֪ͨ��Щ���ܵȴ��ö���Ķ������������̣߳�����ж���̵߳ȴ�����
 * ���̹߳滮�������ѡ������һ����wait״̬���̣߳����䷢��֪ͨnotify����ʹ��
 * �ȴ���ȡ�ö���Ķ�������
 * 
 * ʹ��˼·��
 * 	(1)����ǰ����ǰ�̱߳����øö���Ķ��󼶱���(��ֻ����ͬ��������ͬ�����е���notify()����)
 * 	(2)ִ��notify()�����󣬵�ǰ�̲߳��������ͷŸö���������wait״̬���߳�Ҳ���������ϻ�ȡ�ö���
 * ��,Ҫ�ȵ�ִ��notify()�������߳̽�����ִ���꣬Ҳ�����˳�synchronized�����󣬵�ǰ�̲߳Ż��ͷ�
 * ��������wait״̬���ڵ��̲߳ſ��Ի�ȡ�ö�������
 *  (3)����һ������˸ö�������wait�߳���������Ժ������ͷŵ��ö���������ʱ�������û���ٴ�ʹ��
 * notify��䣬�򼴱�����Ѿ����У�����wait״̬�ȴ����߳����ڵõ��ö����֪ͨ���������������wait
 * ״̬��֪��������󷢳�һ��notify��notifyAll��
 * 
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P138   
 * @author: penggang
 * @date:   2018��1��31�� ����11:11:09   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		try {
			Object lock = new Object();   //������this����

			MyThread1 t1 = new MyThread1(lock);
			t1.start();

			Thread.sleep(3000);

			MyThread2 t2 = new MyThread2(lock);
			t2.start();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
