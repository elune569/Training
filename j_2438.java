package Training;
import java.io.*;
public class j_2438 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < n+1; i++) {
			for(int j = n; j > i; j--) bw.write(" ");
				
			for(int j = 0; j < i; j++) bw.write("*");
			bw.write("\n");
			}
		bw.close();	
	}
}
