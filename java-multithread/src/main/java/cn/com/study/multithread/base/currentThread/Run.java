/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.currentThread   
 * @author: penggang
 * @date:   2018��1��28�� ����9:59:28   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.currentThread;

/**  
 * currentThread():���ش�������ڱ��ĸ��̵߳��õ���Ϣ��
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P16 
 * @author: penggang
 * @date:   2018��1��28�� ����9:59:28   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();		//main��������
		mythread.start();						//�Խ��̵߳���
		mythread.run();    						//main��������
	}
}
