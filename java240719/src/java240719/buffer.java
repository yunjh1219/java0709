package java240719;

import java.io.*;
import java.util.StringTokenizer;

public class buffer {
	  public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

	        int a = Integer.parseInt(br.readLine());

	        for(int i = 0; i < a; i++){
	            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

	            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

	            bw.write(sum + "\n");

	        }
	        
	        bw.flush();
	        bw.close();
	        br.close();

	    }
}