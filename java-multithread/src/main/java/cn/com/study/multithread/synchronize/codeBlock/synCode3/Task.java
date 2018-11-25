/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Task.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode3   
 * @author: penggang
 * @date:   2018��1��30�� ����11:07:28   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode3;

/**  
 * @ClassName:  Task   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��30�� ����11:07:28   
 * 
 **/
public class Task {

	synchronized public void otherMethod() {
		System.out.println("------------------------run--otherMethod");
	}

	public void doLongTimeTask() {
		synchronized (this) {
			for (int i = 0; i < 10000; i++) {
				System.out.println("synchronized threadName="
						+ Thread.currentThread().getName() + " i=" + (i + 1));
			}
		}

	}
}
