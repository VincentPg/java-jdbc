/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.twoObject   
 * @author: penggang
 * @date:   2018��1��29�� ����10:41:38   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.twoObject;

/**  
 * �����������
 * 
 * ���ۣ������̷ֱ߳����ͬһ�����������ͬ��ʵ������ͬ���Ƶ�ͬ�����������첽�ķ�ʽ���С�
 * 
 * synchronized��ȡ���Ƕ������������ǽ�һ�δ���򷽷�(����)��������
 * 
 * �������̷߳��ʵ���ͬһ��������ô�ĸ��߳���ִ�д�synchronized�ؼ��ֵķ������ĸ��߳�
 * �ͳ��и÷��������������Lock����ô�����̴߳��ڵȴ�״̬��
 * 
 * �������̷߳��ʶ��������JVM�ᴴ���������
 * 
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P57  
 * @author: penggang
 * @date:   2018��1��29�� ����10:41:38   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();    //����1
		HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();	//����2

		ThreadA athread = new ThreadA(numRef1);					//�߳�1���ʶ���1
		athread.start();

		ThreadB bthread = new ThreadB(numRef2);					//�߳�2���ʶ���2
		bthread.start();
	}
}
