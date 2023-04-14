package baekjoon;

import java.util.Scanner;

public class Q_2444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num  = n*2 -1;

		
		for(int i=0;i<num;i++) {
			if(i%2==0) {
				for(int j=n-1;j>i/2;j--) {
					System.out.print(" ");
				}
				for(int j=0;j<=i;j++) {	
					System.out.print("*");
				}
			System.out.println();
			}//if end
		}// for end
		int p = 0;
		for(int i=num;i>0;i--) {
			if(i%2==0) {
				p++;
				for(int j=0;j<p;j++) {
					System.out.print(" ");
				}
				for(int j=0;j<i-1;j++) {
					System.out.print("*");
				}
				System.out.println();
			}//if end
		}// for end
		

	}// main() method end

}// public class end

//t1
//for(int i=0;i<num;i++) {
//	for(int j=num;j>i;j--) {
//		System.out.print("@");
//	}
//	for(int j=0;j<=i;j++) {
//		System.out.print("*");
//	}
//	for(int j=num;j>i;j--) {
//		System.out.print("@");
//	}
//	System.out.println();
//}// for end

//t2
//ArrayList<Integer> numArr =new ArrayList<Integer>();
//for(int i=1;i<=num;i++) {
//	if(i%2 == 1) {
//		numArr.add(i);
//	}// if end
//}// for end
//
//for(int i=0;i<numArr.size();i++) {
//	System.out.println(numArr.get(i));
//}
//
//for(int i=0;i<numArr.size();i++) {
//	for(int j=1;j==numArr.get(i);j++) {
//		System.out.println("1");
//	}
//}