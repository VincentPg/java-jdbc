/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.producers_consumers.one   
 * @author: penggang
 * @date:   2018��2��1�� ����9:15:35   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.producers_consumers.one;

/**  
 * һ������һ���ѣ�����ֵ
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P158   
 * @author: penggang
 * @date:   2018��2��1�� ����9:15:35   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);

		ThreadP pThread = new ThreadP(p);
		ThreadC rThread = new ThreadC(r);

		pThread.start();
		rThread.start();
	}
}
