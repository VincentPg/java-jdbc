/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  ObjectService.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.doubleSynblock   
 * @author: penggang
 * @date:   2018年1月30日 下午10:58:01   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.doubleSynblock;

/**  
 * @ClassName:  ObjectService   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月30日 下午10:58:01   
 * 
 **/
public class ObjectService {
	
	public void serviceMethodA() {
		try {
			synchronized (this) {
				System.out.println("A begin time=" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end    end=" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void serviceMethodB() {
		synchronized (this) {
			System.out.println("B begin time=" + System.currentTimeMillis());
			System.out.println("B end    end=" + System.currentTimeMillis());
		}
	}
	
}
