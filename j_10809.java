package Training;
import java.util.Scanner;
public class j_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arrstr = new String[str.length()];
		char[] alpa = new char[26];
		String alpa1 = "";
		int[] cnt = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			arrstr[i] = str.substring(i, i+1);
		}
		for(int i = 0; i < alpa.length; i++) {
			alpa[i] = (char)(97 + i);
			alpa1 += alpa[i];
			cnt[i] = cnt[i] - 1;
		}
		String[] alpastr = alpa1.split("");
		
		for(int i = 0; i < arrstr.length; i++) {
			for(int j = 0; j < alpastr.length; j++) {
				if(arrstr[i].equals(alpastr[j]) && cnt[j] == -1) {
					cnt[j] = cnt[j] + (i + 1);
				}
			}
		}
		for(int i = 0; i < alpastr.length; i++)
			System.out.print(cnt[i] + " ");
		sc.close();
	}
}
