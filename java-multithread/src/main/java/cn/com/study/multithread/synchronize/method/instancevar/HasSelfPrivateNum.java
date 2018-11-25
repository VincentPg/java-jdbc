/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  HasSelfPrivateNum.java   
 * @Package cn.com.study.multithread.synchronize.instancevar   
 * @author: penggang
 * @date:   2018��1��28�� ����10:42:22   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.instancevar;

/**  
 * @ClassName:  HasSelfPrivateNum   
 * @Description:  
 * @author: penggang
 * @date:   2018��1��28�� ����10:42:22   
 * 
 **/
public class HasSelfPrivateNum {
	private int num = 0;

	synchronized public void addI(String username) {
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(username + " num=" + num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
