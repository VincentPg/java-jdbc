/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.createThread2   
 * @author: penggang
 * @date:   2018��1��28�� ����9:15:44   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.createThread2;

/**  
 * ���׼���������߳����Ѿ��̳��������࣬��ô����ҪRunnable�ӿڡ�
 * Java��ʵ�ֽ��java���̳е����⣬ʵ�ֶ�̳е�Ч����
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P8  
 * @author: penggang
 * @date:   2018��1��28�� ����9:15:44   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		Runnable runnable=new MyRunnable();
		Thread thread=new Thread(runnable);
		thread.start();
		System.out.println("���н���!");
	}
}
