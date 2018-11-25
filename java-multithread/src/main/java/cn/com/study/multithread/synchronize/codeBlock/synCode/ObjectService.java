/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ObjectService.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode   
 * @author: penggang
 * @date:   2018��1��30�� ����10:19:51   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode;

/**  
 * @ClassName:  ObjectService   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��30�� ����10:19:51   
 * 
 **/
public class ObjectService {
	public void serviceMethod() {
		try {
			synchronized (this) {
				System.out.println("begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("end    end=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
