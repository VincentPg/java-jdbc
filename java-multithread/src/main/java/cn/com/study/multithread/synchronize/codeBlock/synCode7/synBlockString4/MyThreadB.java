/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThreadB.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4   
 * @author: penggang
 * @date:   2018��1��31�� ����12:49:46   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4;

/**  
 * @ClassName:  MyThreadB   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����12:49:46   
 * 
 **/
public class MyThreadB extends Thread{

	private MyList list;

	public MyThreadB(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			list.add("threadB" + (i + 1));
		}
	}
}
