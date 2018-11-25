/**  
 * All rights Reserved, Designed By www.zzcx.com.cn
 * @Title:  Run.java   
 * @Package cn.com.study.multithread.communication.pipeReaderWriter   
 * @author: penggang
 * @date:   2018年2月6日 下午11:23:38   
 * @version V1.0 
 * @Copyright: 2018 湖南智卓创新信息产业股份有限公司. All rights reserved. 
 * 注意：本内容仅限于公司内部使用，禁止外泄以及用于其他的商业目
 * 
 **/
package cn.com.study.multithread.communication.waitNotify.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/**  
 * 通过管道进行线程间通信：字符流
 * @ClassName:  Run   
 * @Description:Java多线程编程核心技术 --高洪岩 P174  
 * @author: penggang
 * @date:   2018年2月6日 下午11:23:38   
 * 
 **/
public class Run {
	public static void main(String[] args) {

		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();

			PipedReader inputStream = new PipedReader();
			PipedWriter outputStream = new PipedWriter();

			// inputStream.connect(outputStream);
			outputStream.connect(inputStream);

			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();

			Thread.sleep(2000);

			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
