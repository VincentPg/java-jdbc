/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString3   
 * @author: penggang
 * @date:   2018��1��31�� ����9:41:41   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString3;

/**  
 * @ClassName:  Service   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����9:41:41   
 * 
 **/
public class Service {
	private String anyString = new String();

	public void a() {
		try {
			synchronized (anyString) {   //�˴�������������ӵ��Ƕ���anyString��
				System.out.println("a begin");
				Thread.sleep(3000);
				System.out.println("a   end");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void b() {	//�˴�������������ӵ���Service��ʵ������
		System.out.println("b begin");
		System.out.println("b   end");
	}
}
