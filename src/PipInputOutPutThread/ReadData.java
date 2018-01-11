package PipInputOutPutThread;

import java.io.PipedInputStream;

import javax.print.DocFlavor.INPUT_STREAM;

/**
 * 字节流 
 * 字符流readMethod 传参PipedReader 
 * @author songxilong
 *
 */
public class ReadData {
	public void readMethod(PipedInputStream pis) {
		try {
			System.out.println("read begin:");
			byte[] byteArray = new byte[1024];
			int readLength = pis.read(byteArray);
			while(readLength!=-1) {
				String newData = new String(byteArray,0,readLength);
				System.out.println(newData);
				readLength = pis.read(byteArray);
			}
			System.out.println();
			pis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
