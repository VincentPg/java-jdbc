/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.drainPermits   
 * @author: penggang
 * @date:   2018��2��16�� ����10:50:25   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.drainPermits;

/**  
 * @ClassName:  Run   
 * @Description:Java������̺��ķ������� --�ߺ��� P11
 * @author: penggang
 * @date:   2018��2��16�� ����10:50:25   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		MyService service = new MyService();
		service.testMethod();
	}

}
