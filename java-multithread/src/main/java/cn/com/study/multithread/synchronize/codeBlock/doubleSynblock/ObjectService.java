/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ObjectService.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.doubleSynblock   
 * @author: penggang
 * @date:   2018��1��30�� ����10:58:01   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.doubleSynblock;

/**  
 * @ClassName:  ObjectService   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��30�� ����10:58:01   
 * 
 **/
public class ObjectService {
	
	public void serviceMethodA() {
		try {
			synchronized (this) {
				System.out.println("A begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end    end=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void serviceMethodB() {
		synchronized (this) {
			System.out.println("B begin time=" + System.currentTimeMillis());
			System.out.println("B end    end=" + System.currentTimeMillis());
		}
	}
	
}
