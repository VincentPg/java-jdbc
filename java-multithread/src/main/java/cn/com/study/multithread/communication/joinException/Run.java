/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.joinException   
 * @author: penggang
 * @date:   2018��2��7�� ����12:02:26   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.joinException;

/**  
 *  ����join���쳣
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P181   
 * @author: penggang
 * @date:   2018��2��7�� ����12:02:26   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		try {
			ThreadB b = new ThreadB();
			b.start();

			Thread.sleep(500);

			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
