package PipInputOutPutThread;

import java.io.PipedOutputStream;

/**
 * �ֽ��� 
 * �ַ���writeMethod ����PipedWriter д��Str����
 * @author songxilong
 *
 */
public class WriteData {
	public void writeMethod(PipedOutputStream pos,String msg) {
		try {
			System.out.println("write begin:");
//			for(int i=0;i<300;i++) {
//				String outData = "" +(i+1);
//				pos.write(outData.getBytes());
//				System.out.println(outData);
//			}
			pos.write(msg.getBytes());
			System.out.println();
			pos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
