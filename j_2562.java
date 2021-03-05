package Training;
import java.io.*;
public class j_2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] array = new int[9];
		
		for(int i = 0; i < 9; i++)
			array[i] = Integer.parseInt(br.readLine());
		
		int max = array[0];
		
		for(int i = 0; i < 9; i++) {
			if(array[i] > max)
				max = array[i];
		}
		
		for(int i = 0; i < 9; i++) {
			if(array[i] == max) {
				bw.write(max + "\n");
				bw.write(String.valueOf(i+1));
			}
		}
		bw.close();
	}
}
