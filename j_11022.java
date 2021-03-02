package Training;
import java.io.*;
import java.util.*;
public class j_11022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			bw.write("Case #" + (i+1) + ": ");
			bw.write(x + " + " + y + " = " + (x+y));
			bw.write("\n");
		}
		bw.close();
	}	
}
