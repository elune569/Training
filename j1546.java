package Training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int cnt = Integer.parseInt(br.readLine());
		int[] arr = new int[cnt];
		int max = 0;
		double tot = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < cnt; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < cnt; i++) {
				if(arr[i] > max)
					max = arr[i];
		}
		for(int i = 0; i < cnt; i++)
			tot += ((double)arr[i]/max*100);
		
		double avg = (double)tot/cnt;
		
		System.out.println(avg);
	}
}
