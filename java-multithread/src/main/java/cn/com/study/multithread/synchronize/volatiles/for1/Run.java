/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.volatiles.for1   
 * @author: penggang
 * @date:   2018��1��31�� ����9:38:46   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.volatiles.for1;

/**  
 * �ؼ���volatile����ѭ��
 * 
 * ��ѭ���ĸ���ԭ��
 * 	main�߳�һֱ�ڴ���while()ѭ�������³����ܼ���ִ�к���Ĵ��롣
 * ���˼·�����̼߳�����
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P119  
 * @author: penggang
 * @date:   2018��1��31�� ����9:38:46   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("��Ҫֹͣ����stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}
}
