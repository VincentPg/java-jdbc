/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.instancevar   
 * @author: penggang
 * @date:   2018��1��28�� ����10:44:22   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.instancevar;

import cn.com.study.multithread.synchronize.method.functionvar.HasSelfPrivateNum;
import cn.com.study.multithread.synchronize.method.functionvar.ThreadA;
import cn.com.study.multithread.synchronize.method.functionvar.ThreadB;

/**  
 * ʵ���������̰߳�ȫ��
 * ���������
 * 	����HasSelfPrivateNum�б�����̷߳��ʵķ�����ӹؼ���synchronized����
 * 
 * ���ۣ��������̷߳���ͬһ�������е�ͬ������(�ùؼ���synchronized����)ʱһ���ǰ�ȫ�ġ�
 * �̰߳�ȫ<=>ͬ����˳����á�
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P55 
 * @author: penggang
 * @date:   2018��1��28�� ����10:44:22   
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
