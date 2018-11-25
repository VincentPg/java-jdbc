/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.twoObject2   
 * @author: penggang
 * @date:   2018��1��29�� ����11:48:07   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.twoObject2;

/**  
 * ����:
 * 1) A�߳��ȳ���object�����Lock����B�߳̿������첽�ķ�ʽ����object�����еķ�synchronized���͵ķ�����
 * 2) A�߳��ȳ���object�����Lock����B�߳��������ʱ����object�����е�synchronized���͵ķ�������Ҫ�ȴ���Ҳ����ͬ����
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P61 
 * @author: penggang
 * @date:   2018��1��29�� ����11:48:07   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		MyObject object = new MyObject();    //����ʵ��object
		ThreadA a = new ThreadA(object);	 //�߳�A����ʵ��object
		a.setName("A");
		ThreadB b = new ThreadB(object);	 //�߳�B����ʵ��object
		b.setName("B");

		a.start();
		b.start();
	}
}
