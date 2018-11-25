/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.Pool_List   
 * @author: penggang
 * @date:   2018��2��16�� ����12:22:57   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.Pool_List;

/**  
 * @ClassName:  Run   
 * @Description:Java������̺��ķ������� --�ߺ��� P23  
 * @author: penggang
 * @date:   2018��2��16�� ����12:22:57   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {

		ListPool pool = new ListPool();

		MyThread[] threadArray = new MyThread[12];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(pool);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}

	}
}
