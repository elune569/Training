package Training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j_4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		double[] human = new double[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int students = Integer.parseInt(st.nextToken());
			int[] arr = new int[students];
			int sum = 0, cnt = 0;
			for(int j = 0; j < students; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			} // 배열 삽입 + 총합
			double avg = (double)sum / students;
			for(int j = 0; j < students; j++) {
				if(arr[j] > avg)
					cnt++;
			} // 평균보다 높으면 카운트
			human[i] = (double)cnt/students * 100;
		}
        for(int i = 0; i < n; i++)
            System.out.println(String.format("%.3f",human[i]) + "%");
	}
}
