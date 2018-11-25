/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Task.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.problem   
 * @author: penggang
 * @date:   2018年1月30日 下午2:05:12   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.problem;

/**  
 * @ClassName:  Task   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月30日 下午2:05:12   
 * 
 **/
public class Task {
	private String getData1;
	private String getData2;

	public synchronized void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);
			getData1 = "长时间处理任务后从远程返回的值1 threadName="
					+ Thread.currentThread().getName();
			getData2 = "长时间处理任务后从远程返回的值2 threadName="
					+ Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
