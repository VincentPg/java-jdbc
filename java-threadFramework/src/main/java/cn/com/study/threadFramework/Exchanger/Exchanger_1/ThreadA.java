/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadA.java   
 * @Package cn.com.study.threadFramework.Exchanger.Exchanger_1   
 * @author: penggang
 * @date:   2018��2��16�� ����12:42:02   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Exchanger.Exchanger_1;

import java.util.concurrent.Exchanger;

/**  
 * @ClassName:  ThreadA   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��2��16�� ����12:42:02   
 * 
 **/
public class ThreadA extends Thread{
	
	private Exchanger<String> exchanger;

	public ThreadA(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println("���߳�A�еõ��߳�B��ֵ=" + exchanger.exchange("�й���A"));
			System.out.println("A end!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
