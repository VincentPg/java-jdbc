/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.functionvar   
 * @author: penggang
 * @date:   2018��1��28�� ����10:24:23   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.functionvar;

/**  
 * �����еı��������ڷ��̰߳�ȫ���⣬��Զ���̰߳�ȫ�ġ�
 * ��jvm�ڴ�ģ�͵ĽǶ���������
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P53  
 * @author: penggang
 * @date:   2018��1��28�� ����10:24:23   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		HasSelfPrivateNum numRef = new HasSelfPrivateNum();       //һ������

		ThreadA athread = new ThreadA(numRef);					  //һ���߳�
		athread.start();

		ThreadB bthread = new ThreadB(numRef);					  //һ���߳�
		bthread.start();
	}
}
