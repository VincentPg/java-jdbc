/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadB.java   
 * @Package cn.com.study.threadFramework.Exchanger.Exchanger_2   
 * @author: penggang
 * @date:   2018��2��16�� ����12:53:53   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Exchanger.Exchanger_2;

import java.util.concurrent.Exchanger;

/**  
 * @ClassName:  ThreadB   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��2��16�� ����12:53:53   
 * 
 **/
public class ThreadB extends Thread{
	
	private Exchanger<String> exchanger;

	public ThreadB(Exchanger<String> exchanger) {
		super();
		this.exchanger = exchanger;
	}

	@Override
	public void run() {
		try {
			System.out.println("���߳�B�еõ��߳�A��ֵ=" + exchanger.exchange("�й���B"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
