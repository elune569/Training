package Training;
import java.io.*;
public class j_2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = n; j > 0; j--) {
				bw.write("*");
			}
			bw.write("\n");
		}
		bw.close();	
	}
}
