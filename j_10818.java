package Training;
import java.io.*;
import java.util.StringTokenizer;
public class j_10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++)
			array[i] = Integer.parseInt(st.nextToken());
		
		int max = array[0], min = array[0];
		
		for(int i = 0; i < n; i++) {
			if(array[i] > max)
				max = array[i];
			
			if(array[i] < min)
				min = array[i];
		}
		
		bw.write(min + " " + max);
		bw.close();
	}
}
