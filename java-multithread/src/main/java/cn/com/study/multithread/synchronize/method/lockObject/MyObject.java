/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyObject.java   
 * @Package cn.com.study.multithread.synchronize.lockObject   
 * @author: penggang
 * @date:   2018��1��29�� ����11:29:53   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.lockObject;

/**  
 * @ClassName:  MyObject   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��29�� ����11:29:53   
 * 
 **/
public class MyObject {
	
	public void methodA() {
		try {
			System.out.println("begin methodA threadName="
					+ Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
