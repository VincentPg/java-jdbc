/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString3   
 * @author: penggang
 * @date:   2018��1��31�� ����9:40:32   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString3;

/**  
 * �����������ͬ�����н�����첽�ġ�
 * 	ͬ���������ڷ�ͬ��synchronized�����н��������������ܱ�֤���÷������̵߳�ִ��
 * ͬ��/˳���ԣ����̵߳��÷�����˳��������ġ�
 * 
 * synchronized(��this����x)ͬ���������Խ��"���"���⡣
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P85   
 * @author: penggang
 * @date:   2018��1��31�� ����9:40:32   
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
