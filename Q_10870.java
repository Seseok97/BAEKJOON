package baekjoon;

import java.util.Scanner;

public class Q_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] intArr = new int[N];
		for(int i=0;i<N;i++) {
			int a = sc.nextInt();
			intArr[i] = a;
			}
		int v = sc.nextInt();
		int j = 0;
		int count = 0;
		while(j<intArr.length) {
			if(v == intArr[j]) {
				count += 1;
			}
			j++;
		}
		System.out.println(count);
	}

}
