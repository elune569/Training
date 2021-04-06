package Training;
import java.util.Scanner;
public class j_11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		String[] arrstr = new String[n];
		String seq = sc.next();
		for(int i = 0; i < n; i++) {
			arrstr[i] = seq.substring(i, i+1);
			sum += Integer.parseInt(arrstr[i]);
		}
		System.out.println(sum);
	}
}
