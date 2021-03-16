package Training;

import java.util.Scanner;

public class j_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			String str = sc.next();
			int sum = 0;
			int score = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					score += 1;
					sum += score;
				} else if(str.charAt(j) == 'X')
					score = 0;
			}
			System.out.println(sum);
		}
	}
}
