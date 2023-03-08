package baekjoon;

import java.util.Scanner;

public class Gob_ha_gi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int b100 = B/100;		
		int b10 = (B%100)/10;	
		int b1 = (B%100)%10;	

		System.out.println(A*b1);
		System.out.println(A*b10);
		System.out.println(A*b100);
		System.out.println(A*B);

	}

}
