/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1   
 * @author: penggang
 * @date:   2018��1��31�� ����9:13:34   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode8.conclusion1;

/**  
 * @ClassName:  Run   
 * @Description:TODO(������һ�仰��������������)   
 * @author: penggang
 * @date:   2018��1��31�� ����9:13:34   
 * 
 **/
public class Run1 {
	public static void main(String[] args) {
		Service service = new Service();
		MyObject object = new MyObject();

		ThreadA a = new ThreadA(service, object);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service, object);
		b.setName("b");
		b.start();
		
	}
}
