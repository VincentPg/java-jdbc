/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyObject.java   
 * @Package cn.com.study.multithread.synchronize.twoObject2   
 * @author: penggang
 * @date:   2018��1��29�� ����11:49:10   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.twoObject2;

/**  
 * @ClassName:  MyObject   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��29�� ����11:49:10   
 * 
 **/
public class MyObject {
	
	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName="
					+ Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+ "'s endTime=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void methodB() {
		try {
			System.out.println("begin methodB threadName="
					+ Thread.currentThread().getName() + " begin time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+ " end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
