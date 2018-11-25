/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode   
 * @author: penggang
 * @date:   2018��1��30�� ����10:18:09   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode;

/**  
 * synchronizedͬ������飺
 * 	�����������̷߳���ͬһ������object�е�synchronized(this)ͬ�������ʱ��һ��
 * ʱ����ֻ����һ���̱߳�ִ�У���һ���̱߳���ȴ���ǰ�߳�ִ��������������Ժ�
 * ����ִ�иô���顣
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P74  
 * @author: penggang
 * @date:   2018��1��30�� ����10:18:09   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		
		ObjectService service = new ObjectService();

		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}
}
