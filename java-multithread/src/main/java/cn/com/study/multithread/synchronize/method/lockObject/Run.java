/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.synchronize.lockObject   
 * @author: penggang
 * @date:   2018��1��29�� ����11:28:19   
 * @version V1.0 
 * @Copyright: 2018 ������׿������Ϣ��ҵ�ɷ����޹�˾. All rights reserved. 
 * ע�⣺�����ݽ����ڹ�˾�ڲ�ʹ�ã���ֹ��й�Լ�������������ҵĿ
 * 
 **/
package cn.com.study.multithread.synchronize.method.lockObject;

/**  
 * ��MyObject�ķ�������synchronized�Ͳ��ӵ�����
 * 		�ӹؼ��ֺ�ͬ��ִ��
 * 		���ӹؼ��֣��첽ִ��
 * ���ۣ�
 * 	(1)���ùؼ���synchronized�����ķ���һ�����Ŷ����С�
 *  (2)ֻ�й�����Դ�Ķ�д���ʲ���Ҫͬ������������ǹ�����Դ����ô����û��ͬ���ı�Ҫ��
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P59  
 * @author: penggang
 * @date:   2018��1��29�� ����11:28:19   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(object);
		a.setName("A");
		ThreadB b = new ThreadB(object);
		b.setName("B");

		a.start();
		b.start();
	}
}
