/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.availablePermits   
 * @author: penggang
 * @date:   2018��2��15�� ����8:44:47   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.availablePermits;

/**  
 * @ClassName:  Run   
 * @Description:Java������̺��ķ������� --�ߺ��� P10   
 * @author: penggang
 * @date:   2018��2��15�� ����8:44:47   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		MyService service = new MyService();
		service.testMethod();

	}
}
