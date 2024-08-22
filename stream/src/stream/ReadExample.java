package stream;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) throws Exception {
      InputStream is = new FileInputStream("C:/Temp/test1.db");
      while(true) {
    	  int data = is.read();
    	  if(data==-1)break;
    	  System.out.println(data);
      }
		is.close();
	}
}