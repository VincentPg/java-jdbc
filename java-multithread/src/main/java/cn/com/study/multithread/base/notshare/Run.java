/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.notshare   
 * @author: penggang
 * @date:   2018��1��28�� ����9:23:23   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.notshare;

/**  
 * �̲߳��������ݡ�
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P9 
 * @author: penggang
 * @date:   2018��1��28�� ����9:23:23   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		//�˴������������̶߳��󣬸��Է����Լ���ʵ������count��  ��һ�߳�һ������
		MyThread a = new MyThread("A");
		MyThread b = new MyThread("B");
		MyThread c = new MyThread("C");
		a.start();
		b.start();
		c.start();
	}
}
