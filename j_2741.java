package Training;
import java.io.*;
public class j_2741 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		for(int i = 1; i <= n; i++) {
			a += i;
			bw.write(String.valueOf(a) + "\n");
		}
		bw.close();
	}
}
