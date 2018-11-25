/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString   
 * @author: penggang
 * @date:   2018��1��30�� ����11:37:17   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString;

/**  
 * 1������ͬ��˼·��
 * synchronizedͬ���������ã�
 * 		(1)������synchronizedͬ��������synchronized(this)ͬ���������ó�����״̬��
 * 		(2)ͬһʱ�䣬ֻ��һ���߳̿���ִ��synchronizedͬ�������еĴ��롣
 * synchronized(this)ͬ����������ã�
 *  	(1)������synchronizedͬ��������synchronized(this)ͬ���������ó�����״̬��
 * 		(2)ͬһʱ�䣬ֻ��һ���߳̿���ִ��synchronized(this)ͬ��������еĴ��롣
 * synchronized(��this����)ͬ����������ã�
 * 		(1)�ڶ���̳߳���"���������"Ϊͬһ�������ǰ���£�ͬһʱ����ֻ��һ���߳̿���ִ��
 * synchronized(��this����)ͬ��������еĴ��롣
 * 		(2)������"���������"Ϊͬһ�������ǰ���£�ͬһʱ��ֻ��һ���߳̿���ִ��synchronized(��this����)
 * ͬ��������еĴ��롣
 * 2������˼·��ȱ�㣺
 * 	   ���һ�������кܶ��synchronized����,��ʱ��ʵ��ͬ���������ܵ�������Ӱ������Ч�ʣ�
 * 	   ���ʹ��ͬ�����������this������synchronized(��this)������еĳ�����ͬ���������첽�ģ�
 * ����������thisͬ����������this����������������Ч�ʡ�
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P82  
 * @author: penggang
 * @date:   2018��1��30�� ����11:37:17   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();
	}
}
