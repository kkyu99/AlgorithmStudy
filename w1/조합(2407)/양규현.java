package study_java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class combine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		BigDecimal combination_num = new BigDecimal(1);

		
		for(int i = n; i > n-m; i--) {
			BigDecimal big_i = new BigDecimal(i);
			combination_num = combination_num.multiply(big_i);
		}
		
		for(int i = 1; i < m+1; i++) {
			BigDecimal big_i = new BigDecimal(i);
			combination_num = combination_num.divide(big_i, 0,RoundingMode.DOWN);
		}
		

		System.out.println(combination_num);
		
		
	}

}
