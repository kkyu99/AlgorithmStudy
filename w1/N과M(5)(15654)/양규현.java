import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i <N; i++) {
			nums.add(Integer.parseInt(st.nextToken()));
			
		}
		
		nums.sort(null);
		

		recruit(nums, new ArrayList<Integer>(),M);
	}
	
	public static void recruit(ArrayList<Integer> unuse, ArrayList<Integer> used,int M) {
		
		if(used.size() == M) {
			for(int i : used) {
				System.out.print(i+" ");
			}
			System.out.print("\n");
			return;
		}
		else {

			for (int i = 0; i < unuse.size(); i++) {
	            used.add(unuse.get(i));
	            int buffer = unuse.get(i);
	            unuse.remove(i); // 값을 기반으로 제거
	            recruit(unuse, used,M);
	            used.remove(used.size()-1); // 백트래킹을 위해 다시 제거
	            unuse.add(i, buffer);	        
	            }
	    
	    }
	}

}