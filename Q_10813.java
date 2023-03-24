package baekjoon;

import java.util.Scanner;

public class Q_10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] baguni = new int[N];
		for(int a=0;a<baguni.length;a++) {
			baguni[a] = a+1;
		}
		int M = sc.nextInt();
		int tmp = 0;
		for(int a=0;a<M;a++) {
			int i = sc.nextInt() -1;
			int j = sc.nextInt() -1;
			
			tmp = baguni[i];
			baguni[i] = baguni[j];
			baguni[j] = tmp;
			
		}
		for(int i=0;i<baguni.length;i++) {
			System.out.println(baguni[i]);
		}
	}

}// public class end
