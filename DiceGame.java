package baekjoon;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if((A>=1 && A<=6)&&(B>=1 && B<=6)&&(C>=1 && C<=6)) {
			int money = 0;
			
			if((A==B) || (B==C) || (C==A)) {
				money = 0;
				if(A==B) {
					money = 1000+(A*100);
				}else if(B==C) {
					money = 1000+(B*100);
				}else if(C==A) {
					money = 1000+(C*100);
				}
				
				if((A==B) && (B==C) && (C==A)) {
					money = 10000+(A*1000);
				}//1
			}//2
			else {
				if(A>=B && A>=C) {
					money = A*100;
				}else if(B>=C) {
					money = B*100;
				}else {
					money = C*100;
				}
			}//3
			System.out.println(money);
		}
		
	}

}
