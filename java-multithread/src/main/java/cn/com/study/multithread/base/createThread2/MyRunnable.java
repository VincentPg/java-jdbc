/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyRunnable.java   
 * @Package cn.com.study.multithread.base.createThread2   
 * @author: penggang
 * @date:   2018��1��28�� ����9:15:05   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.base.createThread2;

/**  
 * @ClassName:  MyRunnable   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��28�� ����9:15:05   
 * 
 **/
public class MyRunnable implements Runnable{

	/**   
	 * <p>Title: run</p>   
	 * <p>Description: </p>      
	 * @see java.lang.Runnable#run()   
	 */
	public void run() {
		System.out.println(Thread.currentThread().getName()+"������!");
	}

}
