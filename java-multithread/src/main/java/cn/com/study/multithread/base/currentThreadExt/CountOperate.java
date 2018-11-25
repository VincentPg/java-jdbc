/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  CountOperate.java   
 * @Package cn.com.study.multithread.base.currentThreadExt   
 * @author: penggang
 * @date:   2018��1��28�� ����10:09:35   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.currentThreadExt;

/**  
 * @ClassName:  CountOperate   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��28�� ����10:09:35   
 * 
 **/
public class CountOperate extends Thread{
	
	public CountOperate() {
		System.out.println("CountOperate---begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("CountOperate---end");
	}

	@Override
	public void run() {
		System.out.println("run---begin");
		System.out.println("Thread.currentThread().getName()="
				+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("run---end");
	}
}
