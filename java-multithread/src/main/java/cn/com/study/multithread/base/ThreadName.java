package cn.com.study.multithread.base;

/**  
 * @ClassName:  ThreadName   
 * @Description: Java多线程编程核心技术 --高洪岩 P4
 * 				 打印当前线程名称
 * @author: penggang
 * @date:   2018年1月28日 下午6:52:30   
 * 
 **/
public class ThreadName {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
	}
}
