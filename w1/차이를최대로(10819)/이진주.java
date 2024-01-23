import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int[] arr;
	static int[] picked;
	static int max = Integer.MIN_VALUE;
	static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

		N = Integer.parseInt(r.readLine());
		arr = new int[N];
		visited = new boolean[N];
		picked = new int[N];

		StringTokenizer st = new StringTokenizer(r.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		search(0);
		w.write(String.valueOf(max));
		w.flush();
		w.close();
	}

	public static void search(int idx) {

		if (idx == N) {
			max = Math.max(max, getD());
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				picked[idx] = arr[i];
				search(idx + 1);
				visited[i] = false;
			}
		}
	}

	public static int getD() {

		int sum = 0;
		for (int i = 0; i < N - 1; i++)
			sum += (Math.abs(picked[i] - picked[i + 1]));

		return sum;
	}

}
