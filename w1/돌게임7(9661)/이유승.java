import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_9661 {
	public static String solution(long n) {
		long temp = n%5;
		boolean[] arr = new boolean[5];
		arr[0] = false;
		arr[1] = true;
		arr[2] = false;
		arr[3] = true;
		arr[4] = true;
		return (arr[(int)temp] == true) ? "SK" : "CY";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println(solution(n));
	}
}

//public static String solution(long n) {
//	long temp = n%5;
//	boolean[] arr = new boolean[5];
//	arr[0] = false;
//	arr[1] = true;
//	arr[2] = false;
//	arr[3] = true;
//	arr[4] = true;
//	HashMap<Long, Boolean> map = new HashMap<Long, Boolean>();
//	map.put(0L, false);
//	map.put(1L, true);
//	map.put(2L, false);
//	map.put(3L, true);
//	map.put(4L, true);
//	for(long i=5; i<=n; i++) {
//		long a = 1;
//		while(i >= a) {
//			if(!map.get(i-a) == true) {
//				map.put(i, true);
//				break;
//			}
//			a *= 4;
//		}
//		if(map.get(i) == null)
//			map.put(i, false);
//	}
//	return (arr[(int)temp] == true) ? "SK" : "CY";
//}
