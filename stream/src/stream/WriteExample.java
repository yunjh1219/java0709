package stream;

import java.io.*;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test1.db");
		//출력 스트림은 바이트를 바로 출력하지 않고, 내부 버퍼(저장소) 우선 저장한 후에 출력한다
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); //버퍼에 잔류된 바이트를 모두 출력
		os.close(); //스트림 종료
	}
}
