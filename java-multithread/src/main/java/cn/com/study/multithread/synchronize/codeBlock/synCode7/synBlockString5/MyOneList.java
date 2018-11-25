/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyOneList.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5   
 * @author: penggang
 * @date:   2018��1��31�� ����12:53:06   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5;

import java.util.ArrayList;
import java.util.List;

/**  
 * @ClassName:  MyOneList   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����12:53:06   
 * 
 **/
public class MyOneList {
	private List list = new ArrayList();

	synchronized public void add(String data) {
		list.add(data);
	};

	synchronized public int getSize() {
		return list.size();
	};
}
