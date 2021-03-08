package Training;
import java.io.*;
public class j_3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] array = new int[10];
		boolean[] array1 = new boolean[42];
		int count = 0;
		int a = 0;
		
		for(int i = 0; i < 42; i++)
			array1[i] = false;
		
		for(int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < 10; i++) {
			a = array[i] % 42;
			for(int j = 0; j < 42; j++) {
				if(a == j) {
					array1[j] = true;
				}
				if(array1[j] = true) {
					count++;
					break;
				}
			}			
		}
		System.out.println(count);
	}
}
