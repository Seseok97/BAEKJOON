package baekjoon;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score<=100 && score>=0) {
			if(score<=100 && score>=90) {
				System.out.println("A");
			}
			if(score<=89 && score>=80) {
				System.out.println("B");
			}
			if(score<=79 && score>=70) {
				System.out.println("C");
			}
			if(score<=69 && score>=60) {
				System.out.println("D");
			}
			if(score<=59 && score>=0) {
				System.out.println("F");
			}
		}

	}

}
