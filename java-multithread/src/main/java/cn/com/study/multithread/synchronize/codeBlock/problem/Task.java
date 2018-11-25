/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Task.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.problem   
 * @author: penggang
 * @date:   2018��1��30�� ����2:05:12   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.problem;

/**  
 * @ClassName:  Task   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��30�� ����2:05:12   
 * 
 **/
public class Task {
	private String getData1;
	private String getData2;

	public synchronized void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			getData1 = "��ʱ�䴦��������Զ�̷��ص�ֵ1 threadName="
					+ Thread.currentThread().getName();
			getData2 = "��ʱ�䴦��������Զ�̷��ص�ֵ2 threadName="
					+ Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
