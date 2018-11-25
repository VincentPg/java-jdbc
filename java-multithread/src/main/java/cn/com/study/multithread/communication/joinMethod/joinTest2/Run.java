/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.joinMethod.joinTest2   
 * @author: penggang
 * @date:   2018��2��6�� ����11:59:24   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.joinMethod.joinTest2;

/**  
 * join�����������
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P180   
 * @author: penggang
 * @date:   2018��2��6�� ����11:59:24   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();

			System.out.println("���뵱threadTest����ִ����Ϻ�����ִ�У���������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
