/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ThreadB.java   
 * @Package cn.com.study.multithread.synchronize.lockObject   
 * @author: penggang
 * @date:   2018��1��29�� ����11:31:02   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.lockObject;

/**  
 * @ClassName:  ThreadB   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��29�� ����11:31:02   
 * 
 **/
public class ThreadB extends Thread{
	
	private MyObject object;

	public ThreadB(MyObject object) {
		super();
		this.object = object;
	}

	@Override
	public void run() {
		super.run();
		object.methodA();
	}
}
