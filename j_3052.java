package Training;
import java.io.*;
public class j_3052 {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] array = new int[10];
		boolean[] array1 = new boolean[42];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(br.readLine());
			array[i] %= 42;
		}
				
		for(int i = 0; i < 42; i++)
			array1[i] = false;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 42; j++) {
				if(array[i] == j)
					array1[j] = true;
			}
		}		
		for(int i = 0; i < 42; i++) {
			if(array1[i] == true)
				count++;
		}
		
		bw.write(count + "\n");
		bw.close();
	}
}
