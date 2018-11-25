/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyOneList.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5   
 * @author: penggang
 * @date:   2018年1月31日 下午12:53:06   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString5;

import java.util.ArrayList;
import java.util.List;

/**  
 * @ClassName:  MyOneList   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午12:53:06   
 * 
 **/
public class MyOneList {
	private List list = new ArrayList();

	synchronized public void add(String data) {
		list.add(data);
	};

	synchronized public int getSize() {
		return list.size();
	};
}
