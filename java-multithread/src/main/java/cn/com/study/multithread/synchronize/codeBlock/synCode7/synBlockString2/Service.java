/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Service.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString   
 * @author: penggang
 * @date:   2018��1��30�� ����11:38:25   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString2;

/**  
 * @ClassName:  Service   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��30�� ����11:38:25   
 * 
 **/
public class Service {
	
	private String usernameParam;
	private String passwordParam;

	public void setUsernamePassword(String username, String password) {
		try {
			String anyString = new String();      //������Ч������ÿ���̻߳�ȡ�Ĳ���ͬһ������������������̷߳���������첽��Ч�����е�ֲ�������˼��
			synchronized (anyString) {
				System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
						+ "��" + System.currentTimeMillis() + "����ͬ����");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("�߳�����Ϊ��" + Thread.currentThread().getName()
						+ "��" + System.currentTimeMillis() + "�뿪ͬ����");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
