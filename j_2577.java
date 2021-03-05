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
		System.out.println(d);
		while(d1 > 0) {
			n++;
			e = d1 % 10;
			d1 /= 10;
		}
		int[] array = new int[n];
		
		for(int i = n-1; i >= 0; i--) {
			array[i] = d % 10;
			d /= 10;
		}
		for(int i = 0; i < n; i++)
			System.out.println(array[i]);
		
	}
}




