package baekjoon;

import java.util.Scanner;

public class Q_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1;i<N+1;i++) {
			for(int k=N;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}