package PipInputOutPutThread;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 线程间的字节流传递信息
 * 
 * @author songxilong
 *
 */
public class Run {
	public static void main(String[] args) {
		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			
			//管道输入输出字节流
			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();
			
			//连接输入流与输出流
			outputStream.connect(inputStream);
			
			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();
			
			Thread.sleep(2000);
			
			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
