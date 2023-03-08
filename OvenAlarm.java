package baekjoon;

import java.util.Scanner;

public class OvenAlarm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 현재 시간 시
		int B = sc.nextInt(); // 현재 시간 분
		int C = sc.nextInt(); // 필요 시간
		if((A>=0 && A<=23) && (B>=0 && B<=59) && (C>=0 && C<=1000)) {
			int sum = 0;
			sum = B+C;
			B += C;
			
			
			if(B>=60) {
				B %= 60;
				A = A+(sum/60);
			}
			if(A>=24) {
				A %= 24;
			}
			System.out.println(A+" "+B );
		}

	}

}
