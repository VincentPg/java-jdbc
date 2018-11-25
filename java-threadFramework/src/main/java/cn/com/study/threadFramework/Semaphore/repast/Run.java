/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Semaphore.repast   
 * @author: penggang
 * @date:   2018��2��16�� ����12:37:29   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Semaphore.repast;

/**  
 * @ClassName:  Run   
 * @Description:Java������̺��ķ������� --�ߺ��� P25 
 * @author: penggang
 * @date:   2018��2��16�� ����12:37:29   
 * 
 **/
public class Run {

	public static void main(String[] args) throws InterruptedException {
		RepastService service = new RepastService();
		ThreadP[] arrayP = new ThreadP[60];
		ThreadC[] arrayC = new ThreadC[60];
		for (int i = 0; i < 60; i++) {
			arrayP[i] = new ThreadP(service);
			arrayC[i] = new ThreadC(service);
		}
		Thread.sleep(2000);
		for (int i = 0; i < 60; i++) {
			arrayP[i].start();
			arrayC[i].start();
		}
	}
}
