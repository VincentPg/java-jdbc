/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run2.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1   
 * @author: penggang
 * @date:   2018��1��31�� ����9:17:27   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1;

/**  
 * synchronized(��this����x):��x��������Ϊ"���������"
 * 
 * ���ۣ�
 * (1)������߳�ͬʱִ��synchronized(x){}ͬ�������ʱ��ͬ��Ч����
 * (2)�������߳�ִ��x������synchronizedͬ������ʱ��ͬ��Ч����
 * (3)�������߳�ִ��x���󷽷������synchronized(this)�����ʱҲ����ͬ��Ч����
 * @ClassName:  Run2   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����9:17:27   
 * 
 **/
public class Run2 {
	public static void main(String[] args) {
		Service service = new Service();
		MyObject object1 = new MyObject();
		MyObject object2 = new MyObject();

		ThreadA a = new ThreadA(service, object1);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service, object2);
		b.setName("b");
		b.start();
	}
}
