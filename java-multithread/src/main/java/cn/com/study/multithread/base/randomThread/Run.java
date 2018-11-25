/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.base.randomThread   
 * @author: penggang
 * @date:   2018年1月28日 下午8:54:05   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.base.randomThread;

/**  
 * (1)调用start方法：
 *     通知"线程规划器"此线程已经准备就绪，等待调用线程对象的
 * run()方法，使得线程得到运行，启动线程，具有【异步执行】的效果
 * (2)调用线程重写的run方法(或者thread.run()):
 *     此线程对象并不交给"线程规划器"来进行处理，而是由main主线程来调
 *     用run()方法，即等run()方法中的代码执行完后才可以执行后面的代码。
 *     具有【同步执行】的效果。
 * @ClassName:  Run   
 * @Description:  Java多线程编程核心技术 --高洪岩 P6 
 * 			线程随机性：CPU执行线程具有不确定性。   
 * @author: penggang
 * @date:   2018年1月28日 下午8:54:05   
 * 
 **/
public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setName("myThread");
			thread.start();
	
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				
					Thread.sleep(time);
				
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
