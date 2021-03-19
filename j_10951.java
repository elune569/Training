package Training;
import java.util.*;
/*
  이클립스랑 인텔리제이에서는 보이는 문제는 없이 잘 돌아간다.
 */
import java.io.*;
public class j_10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = null;
		
		
		while((input = br.readLine()) != null && input.length() != 0) {
			StringTokenizer st = new StringTokenizer(input);
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(num1 + num2)+"\n");
		}
		bw.close();
	}
}
