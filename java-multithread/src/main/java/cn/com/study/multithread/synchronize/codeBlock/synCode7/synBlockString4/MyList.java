/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyList.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4   
 * @author: penggang
 * @date:   2018��1��31�� ����12:48:29   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4;

import java.util.ArrayList;
import java.util.List;

/**  
 * @ClassName:  MyList   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����12:48:29   
 * 
 **/
public class MyList {

	private List list = new ArrayList();

	synchronized public void add(String username) {
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "ִ����add������");
		list.add(username);
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "�˳���add������");
	}

	synchronized public int getSize() {
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "ִ����getSize������");
		int sizeValue = list.size();
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "�˳���getSize������");
		return sizeValue;
	}
}
