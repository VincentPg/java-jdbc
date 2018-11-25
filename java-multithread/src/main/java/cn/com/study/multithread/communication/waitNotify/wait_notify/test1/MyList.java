/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyList.java   
 * @Package cn.com.study.multithread.communication.wait_notify.test1   
 * @author: penggang
 * @date:   2018年1月31日 下午10:29:05   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.wait_notify.test1;

import java.util.ArrayList;
import java.util.List;

/**  
 * @ClassName:  MyList   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午10:29:05   
 * 
 **/
public class MyList {
	private List list = new ArrayList();

	public void add() {
		list.add("高洪岩");
	}

	public int size() {
		return list.size();
	}
}
