/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run1.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test2   
 * @author: penggang
 * @date:   2018��1��31�� ����10:45:57   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test2;

/**  
 * �쳣��java.lang.IllegalMonitorStateException
 * û��"���������"
 * @ClassName:  Run1   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P137   
 * @author: penggang
 * @date:   2018��1��31�� ����10:45:57   
 * 
 **/
public class Run1 {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
