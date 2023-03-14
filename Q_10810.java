package baekjoon;

import java.util.Scanner;

public class Q_10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] baguni = new int[N];
		int M = sc.nextInt();
		for(int a=0;a<M;a++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int k = sc.nextInt();
			for(int b=i;i<=j;i++) {
				baguni[i] = k;
			}
//			if(i==j) {
//				baguni[i-1] = k;
//			}	
		}// for end
		for(int i=0;i<baguni.length;i++) {
		System.out.println(baguni[i]);
		}
		

	}

}// public class end

//try1

//int M = sc.nextInt();
//int N = sc.nextInt();
//for(int a=0;a<M;a++) {
//	System.out.print(1);
//	for(int b=0;b<N;b++) {
//		int i = sc.nextInt();
//		int j = sc.nextInt();
//		int k = sc.nextInt();
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);
//		
//	}
//	System.out.println();
