/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode2   
 * @author: penggang
 * @date:   2018��1��30�� ����10:41:18   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode2;

/**  
 * һ���첽��һ��ͬ����
 * 	����synchronized���о����첽ִ�У���synchronized���о���ͬ��ִ�С�
 * 
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P76   
 * @author: penggang
 * @date:   2018��1��30�� ����10:41:18   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		Task task = new Task();

		MyThread1 thread1 = new MyThread1(task);
		thread1.start();

		MyThread2 thread2 = new MyThread2(task);
		thread2.start();
	}
}
