package cn.com.study.multithread.communication.joinMethod.joinTest1;

/**  
 * join方法的问题背景
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P180   
 * @author: penggang
 * @date:   2018年2月6日 下午11:56:47   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		MyThread threadTest = new MyThread();
		threadTest.start();

		// Thread.sleep(?)
		System.out.println("我想当threadTest对象执行完毕后我再执行");
		System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
		System.out.println("答案是：根据不能确定:)");
	}
}
