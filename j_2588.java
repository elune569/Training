package test1;
import java.io.*;
public class j_2588 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(a*(b%100%10)) + "\n");
		bw.write(String.valueOf(a*(b%100/10)) + "\n");	
		bw.write(String.valueOf(a*(b/100)) + "\n");
		bw.write(String.valueOf(a*b));
		bw.close();
	}
}
