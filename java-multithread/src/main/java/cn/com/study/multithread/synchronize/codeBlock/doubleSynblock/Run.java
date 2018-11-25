package cn.com.study.multithread.synchronize.codeBlock.doubleSynblock;

/**  
 * synchronized代码块间的同步性：
 * 	当一个线程访问object的一个synchronized(this)同步代码块时，其它线程对同一个
 * object中所有其它synchronized(this)同步代码块的访问将被阻塞，即synchronized使用
 * 的"对象监视器"是一个。
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P78 
 * @author: penggang
 * @date:   2018年1月30日 下午10:56:48   
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
