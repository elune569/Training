package Training;
import java.io.*;
import java.util.StringTokenizer;
public class j_2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = a * b * c;
		int d1 = d;
		int e;
		int n = 0;

		while(d1 > 0) {
			n++;
			e = d1 % 10;
			d1 /= 10;
		}
		int[] array = new int[n];
		int[] checkarray = new int[10];
		
		for(int i = n-1; i >= 0; i--) {
			array[i] = d % 10;
			d /= 10;
		}
		for(int i = 0; i < 9; i++)
			checkarray[i+1] = i+1;
		
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(array[j] == checkarray[i])
					count++;
			}
			bw.write(String.valueOf(count) + "\n");
		}
		bw.close();
	}
}




