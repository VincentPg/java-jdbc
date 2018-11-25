/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.dirtyRead   
 * @author: penggang
 * @date:   2018��1��30�� ����12:05:16   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.dirtyRead;

/**  
 * �������ֵ�ķ�����ͬ���ģ�ȡֵ�ķ���û��ͬ������ȡֵ��ʱ�򣬸�ֵ�Ѿ��������߳��޸��ˡ�
 * 
 * ������˼·��synchronized��
 * 
 * ���ۣ�
 * (1)��A�̵߳�����������ͬ������X(��synchronized����)ʱ��A�̻߳�øö�������������̱߳���
 * ��A�߳�ִ����Ϻ�ſ��Ե���X���������������߳̿��Ե���δͬ���ķ���(û��synchronized���ε�)
 * (2)��A�̵߳�����������ͬ������Xʱ(��synchronized����)ʱ��A�̻߳�øö�������������̱߳���
 * ��A�߳�ִ����Ϻ�ſ��Ե���X����������߳�B����������synchronized�ؼ��ֵķ�X����ʱ�������A�߳�
 * ��X����ִ����(�ͷŶ�����)��ſ��Ե��á������ͽ�����������
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P63
 * @author: penggang
 * @date:   2018��1��30�� ����12:05:16   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA thread = new ThreadA(publicVarRef);
			thread.start();

			Thread.sleep(200);// ��ӡ����ܴ�ֵ��СӰ��

			publicVarRef.getValue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
