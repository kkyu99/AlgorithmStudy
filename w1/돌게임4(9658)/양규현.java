package study_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Stone {
	static int[] array;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		array = new int[N+1];
		int answer = stone(N);
		if(answer == 2) {
			System.out.println("SK");
		}
		else {
			System.out.println("CY");
		}
	}
	
	static int stone(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else if(n==3) {
			return 1;
		}
		else if (n==4) {
			return 2;
		}
		else if (n==5){
			return 2;
		}
		else {
			if(array[n] == 0) {
				if((stone(n-1) == 2 && stone(n-3) ==2 && stone(n-4) ==2)) {
					array[n] = 1;
					return 1;
				}
				else {
					array[n] =2;	
					return 2;
				}
			}
			else {
				return array[n];
			}
		}
	}

}