package baekjoon;

import java.util.Scanner;

public class Q_27866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int i = sc.nextInt();
		
		
//		String str = S.substring(i, i);
//		String str = S.substring(i, i+1);
		String str = S.substring(i-1, i);
		System.out.println(str);

	}

}
