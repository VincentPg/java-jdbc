/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyList.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test1   
 * @author: penggang
 * @date:   2018��1��31�� ����10:29:05   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test1;

import java.util.ArrayList;
import java.util.List;

/**  
 * @ClassName:  MyList   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����10:29:05   
 * 
 **/
public class MyList {
	private List list = new ArrayList();

	public void add() {
		list.add("�ߺ���");
	}

	public int size() {
		return list.size();
	}
}
