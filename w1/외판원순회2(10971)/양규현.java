package D0119_bj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TSP {
	static long answer = Integer.MAX_VALUE;
	static int[][] array;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(st.nextToken());
		array = new int[N][N];
		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 0; i <N; i++) {
			list.add(i);
		}
		
		for(int i = 0; i <N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <N; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i <N; i++) {
			int tmp = list.get(i);
			list.remove(i);
			salesman(i,list,i,0);
			list.add(i,tmp);
		}

		bw.write(answer+"");
		bw.flush();
		bw.close();
		
	}

	static void salesman(int first_city, ArrayList<Integer> unuse, int position,int cost){
		if(unuse.isEmpty()) {
			if (array[position][first_city] != 0) {
				cost += array[position][first_city];
				if (cost < answer) {
					answer = cost;
				}
				return;
			}
			return;
		}
		
		for(int i = 0; i<unuse.size();i++) {
			if(array[position][unuse.get(i)] != 0) {
				int tmp_cost = cost;
				int tmp_position = position;
				cost += array[position][unuse.get(i)];
				
				position = unuse.get(i);
				int tmp = unuse.get(i);
				unuse.remove(i);
				salesman(first_city,unuse,position,cost);
				
				
				unuse.add(i,tmp);
				cost = tmp_cost;
				position = tmp_position;
				
			}
			
		}
		
		
	}

}
