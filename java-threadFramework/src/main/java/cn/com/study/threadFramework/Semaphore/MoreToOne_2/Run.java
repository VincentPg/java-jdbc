/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.MoreToOne_2   
 * @author: penggang
 * @date:   2018��2��16�� ����12:12:39   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.MoreToOne_2;

/**  
 * @ClassName:  Run   
 * @Description:Java������̺��ķ������� --�ߺ��� P20   
 * @author: penggang
 * @date:   2018��2��16�� ����12:12:39   
 * 
 **/
public class Run {

	public static void main(String[] args) {
		Service service = new Service();

		MyThread[] threadArray = new MyThread[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(service);
			threadArray[i].start();
		}
	}

}
