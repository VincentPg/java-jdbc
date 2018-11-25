/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.threadFramework.Exchanger.Exchanger_1   
 * @author: penggang
 * @date:   2018��2��16�� ����12:40:50   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.threadFramework.Exchanger.Exchanger_1;

import java.util.concurrent.Exchanger;

/**  
 * @ClassName:  Run   
 * @Description:Java������̺��ķ������� --�ߺ��� P31  
 * @author: penggang
 * @date:   2018��2��16�� ����12:40:50   
 * 
 **/
public class Run {

	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<String>();
		ThreadA a = new ThreadA(exchanger);
		a.start();
		System.out.println("main end!");
	}
}
