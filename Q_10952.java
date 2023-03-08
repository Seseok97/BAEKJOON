package baekjoon;

import java.util.Scanner;

public class Q_10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bo = true;
		while(bo) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A==0 && B == 0) {
				bo=false;
			}else {
				System.out.println(A+B);
			}
		}
	}

}
