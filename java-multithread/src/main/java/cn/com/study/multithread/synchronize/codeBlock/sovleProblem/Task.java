/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Task.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.sovleProblem   
 * @author: penggang
 * @date:   2018年1月30日 下午10:34:03   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.sovleProblem;

/**  
 * @ClassName:  Task   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月30日 下午10:34:03   
 * 
 **/
public class Task {

	private String getData1;
	private String getData2;

	public void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(3000);

			String privateGetData1 = "长时间处理任务后从远程返回的值1 threadName="
					+ Thread.currentThread().getName();
			String privateGetData2 = "长时间处理任务后从远程返回的值2 threadName="
					+ Thread.currentThread().getName();

			synchronized (this) {
				getData1 = privateGetData1;
				getData2 = privateGetData2;
			}
			
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
