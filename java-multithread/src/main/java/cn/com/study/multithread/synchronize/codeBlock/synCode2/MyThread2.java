/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread2.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode2   
 * @author: penggang
 * @date:   2018��1��30�� ����10:51:18   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode2;

/**  
 * @ClassName:  MyThread2   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��30�� ����10:51:18   
 * 
 **/
public class MyThread2 extends Thread{

	private Task task;

	public MyThread2(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();
		task.doLongTimeTask();
	}
}