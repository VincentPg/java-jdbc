/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.acquire   
 * @author: penggang
 * @date:   2018��2��15�� ����7:11:43   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.acquire;

/**  
 * @ClassName:  Run   
 * @Description:Java������̺��ķ������� --�ߺ��� P5   
 * @author: penggang
 * @date:   2018��2��15�� ����7:11:43   
 * 
 **/
public class Run {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();

		ThreadA[] a = new ThreadA[10];
		for (int i = 0; i < 10; i++) {
			a[i] = new ThreadA(service);
			a[i].start();
		}

	}
}
