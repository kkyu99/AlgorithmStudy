import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static int best_result = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		 int N = Integer.parseInt(st.nextToken());
		 st = new StringTokenizer(br.readLine());
		 ArrayList<Integer> list = new ArrayList<>();
		 for(int i = 0; i < N; i++) {
			 list.add(Integer.parseInt(st.nextToken()));
		 }
		 
		 pertutation(new ArrayList<Integer>(),list, N);
		System.out.println(best_result);
		
	}
	
	static void pertutation(ArrayList<Integer> use, ArrayList<Integer> unuse, int N) {
		int result = 0;
		if(use.size() == N) {
			result = result_cal(use);
			if(best_result < result)
				best_result = result;
			return;
		}
		
		for(int i = 0; i < unuse.size(); i++) {
			use.add(unuse.get(i));
			int buf = unuse.get(i);
			unuse.remove(i);
			pertutation(use,unuse, N);
			use.remove(use.size()-1);
			unuse.add(i, buf);
		}
	}
	
	static int result_cal(ArrayList<Integer> list) {
		int result = 0;
		for(int i = 0; i<list.size()-1; i++) {
			result += Math.abs(list.get(i)-list.get(i+1));
		}
		
		return result; 
	}

}