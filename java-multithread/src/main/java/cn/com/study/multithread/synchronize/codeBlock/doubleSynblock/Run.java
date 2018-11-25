package cn.com.study.multithread.synchronize.codeBlock.doubleSynblock;

/**  
 * synchronized�������ͬ���ԣ�
 * 	��һ���̷߳���object��һ��synchronized(this)ͬ�������ʱ�������̶߳�ͬһ��
 * object����������synchronized(this)ͬ�������ķ��ʽ�����������synchronizedʹ��
 * ��"���������"��һ����
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P78 
 * @author: penggang
 * @date:   2018��1��30�� ����10:56:48   
 * 
 **/
public class Run {
	
	public static void main(String[] args) {
		ObjectService service = new ObjectService();

		ThreadA a = new ThreadA(service);
		a.setName("a");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("b");
		b.start();
	}
}
