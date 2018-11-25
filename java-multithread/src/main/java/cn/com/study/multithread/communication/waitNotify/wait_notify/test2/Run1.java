/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run1.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test2   
 * @author: penggang
 * @date:   2018年1月31日 下午10:45:57   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test2;

/**  
 * 异常：java.lang.IllegalMonitorStateException
 * 没有"对象监视器"
 * @ClassName:  Run1   
 * @Description:Java多线程编程核心技术 --高洪岩 P137   
 * @author: penggang
 * @date:   2018年1月31日 下午10:45:57   
 * 
 **/
public class Run1 {
	public static void main(String[] args) {
		try {
			String newString = new String("");
			newString.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
