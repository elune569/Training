package Training;

public class j_15596 {
	public static void main(String[] args) {
		int n = 3;
		int[] arr = new int[n];
		j_15596 j = new j_15596();
		j.sum(arr);
	}

	long sum (int[] a) {
		long ans = 0;
		for(int i = 0; i < a.length; i++)
			ans += a[i];
		return ans;
	}
}
