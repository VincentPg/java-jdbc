package cn.com.study.multithread.communication.joinMethod.joinTest1;

/**  
 * join���������ⱳ��
 * @ClassName:  Run   
 * @Description:Java���̱߳�̺��ļ��� --�ߺ��� P180   
 * @author: penggang
 * @date:   2018��2��6�� ����11:56:47   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		MyThread threadTest = new MyThread();
		threadTest.start();

		// Thread.sleep(?)
		System.out.println("���뵱threadTest����ִ����Ϻ�����ִ��");
		System.out.println("����������е�sleep()�е�ֵӦ��д�����أ�");
		System.out.println("���ǣ����ݲ���ȷ��:)");
	}
}
