package Training;
import java.util.*;
import java.io.*;
public class j_10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		boolean run = true;
		
		while(run) {
			st = new StringTokenizer(br.readLine());
			int ct = st.countTokens();
			while(st.hasMoreTokens())
				bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
			if(ct == 0) break;
		}
		bw.close();
	}
}
