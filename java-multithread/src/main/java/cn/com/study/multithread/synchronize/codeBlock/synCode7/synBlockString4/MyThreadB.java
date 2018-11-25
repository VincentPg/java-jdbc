/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  MyThreadB.java   
 * @Package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4   
 * @author: penggang
 * @date:   2018年1月31日 下午12:49:46   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.synchronize.codeBlock.synCode7.synBlockString4;

/**  
 * @ClassName:  MyThreadB   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: penggang
 * @date:   2018年1月31日 下午12:49:46   
 * 
 **/
public class MyThreadB extends Thread{

	private MyList list;

	public MyThreadB(MyList list) {
		super();
		this.list = list;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			list.add("threadB" + (i + 1));
		}
	}
}
