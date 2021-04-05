package Training;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class j_4673 {
	static int N = 10001;
	static boolean[] arr = new boolean[N];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 1; i < N; i++) {
			int self = selfNumber(i);
			
			if(self <= N-1)
				arr[self] = true;
		}
		
		for(int i = 1; i < N; i++)
			if(!arr[i])
				bw.write(i + "\n");
		bw.close();
	}
	
	static int selfNumber(int num) {
		int sum = num;
		
		while(true) {
			if(num == 0) break;
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}
}
