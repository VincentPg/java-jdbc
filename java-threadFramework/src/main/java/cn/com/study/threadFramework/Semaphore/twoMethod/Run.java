/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.twoMethod   
 * @author: penggang
 * @date:   2018��2��16�� ����11:01:17   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.twoMethod;

/**  
 * @ClassName:  Run   
 * @Description:Java������̺��ķ������� --�ߺ��� P12   
 * @author: penggang
 * @date:   2018��2��16�� ����11:01:17   
 * 
 **/
public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();

		MyThread firstThread = new MyThread(service);
		firstThread.start();

		MyThread[] threadArray = new MyThread[4];
		for (int i = 0; i < 4; i++) {
			threadArray[i] = new MyThread(service);
			threadArray[i].start();
		}

	}

}
