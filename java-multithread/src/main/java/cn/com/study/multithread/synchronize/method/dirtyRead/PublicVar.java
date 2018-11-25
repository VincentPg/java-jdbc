/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  PublicVar.java   
 * @Package cn.com.study.multithread.synchronize.dirtyRead   
 * @author: penggang
 * @date:   2018��1��30�� ����12:06:16   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.dirtyRead;

/**  
 * @ClassName:  PublicVar   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��30�� ����12:06:16   
 * 
 **/
public class PublicVar {
	
	public String username = "A";
	public String password = "AA";

	synchronized public void setValue(String username, String password) {
		try {
			this.username = username;
			Thread.sleep(5000);
			this.password = password;

			System.out.println("setValue method thread name="
					+ Thread.currentThread().getName() + " username="
					+ username + " password=" + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void getValue() {
		System.out.println("getValue method thread name="
				+ Thread.currentThread().getName() + " username=" + username
				+ " password=" + password);
	}
}
