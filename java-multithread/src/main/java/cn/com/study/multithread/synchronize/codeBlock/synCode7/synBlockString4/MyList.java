/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyList.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4   
 * @author: penggang
 * @date:   2018年1月31日 下午12:48:29   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4;

import java.util.ArrayList;
import java.util.List;

/**  
 * @ClassName:  MyList   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午12:48:29   
 * 
 **/
public class MyList {

	private List list = new ArrayList();

	synchronized public void add(String username) {
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "执行了add方法！");
		list.add(username);
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "退出了add方法！");
	}

	synchronized public int getSize() {
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "执行了getSize方法！");
		int sizeValue = list.size();
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "退出了getSize方法！");
		return sizeValue;
	}
}
