/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThread1.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5   
 * @author: penggang
 * @date:   2018��1��31�� ����12:53:56   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5;

/**  
 * @ClassName:  MyThread1   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����12:53:56   
 * 
 **/
public class MyThread1 extends Thread{
	
	private MyOneList list;

	public MyThread1(MyOneList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		MyService msRef = new MyService();
		msRef.addServiceMethod(list, "A");
	}
}
