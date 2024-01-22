import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		
		if(K==0)
			break;
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i < K; i ++) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		
		ArrayList<Integer> empty_list = new ArrayList<Integer>();
		
		recruit(nums, empty_list);
		System.out.println();
		}
		
		
		
	}
	public static void recruit(ArrayList<Integer> unuse, ArrayList<Integer> used) {
		
		if(used.size() == 6) {
			for(int i : used) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		
		ArrayList<Integer> unuseCopy = new ArrayList<>(unuse);
        for (int i : unuse) {
            used.add(i);
            unuseCopy.remove(Integer.valueOf(i)); 
            recruit(unuseCopy, used);
            used.remove(Integer.valueOf(i)); 
        }
		
		
		
	}

}
