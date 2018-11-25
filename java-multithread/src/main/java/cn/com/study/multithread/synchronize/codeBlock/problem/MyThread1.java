/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread1.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.problem   
 * @author: penggang
 * @date:   2018��1��30�� ����2:06:08   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.problem;

/**  
 * @ClassName:  MyThread1   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��30�� ����2:06:08   
 * 
 **/
public class MyThread1 extends Thread{
	
	private Task task;

	public MyThread1(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}

}
