package baekjoon;

import java.util.Scanner;

public class Q_10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] baguni = new int[N];
		for(int a=0;a<baguni.length;a++) {
			baguni[a] = a+1;
		}
		int M = sc.nextInt();
		for(int a=0;a<M;a++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int tmp = 0;

			for(int b=0;i<j;i++,j--) {
				tmp = baguni[i];
				baguni[i] = baguni[j];
				baguni[j] = tmp;
			}
		}// for end
		for(int c=0;c<baguni.length;c++) {
				System.out.print(baguni[c]+" ");
		}// check for end
	} // main() method end

}// public class end

		
//		for(int a=0;a<baguni.length;a++) {
//			System.out.println(baguni[a]);
//		}
		
//		for(int a=0;a<M;a++) {
//			int i = sc.nextInt()-1;
//			int j = sc.nextInt()-1;
//			int tmp = 0;
//
//			for(int b=0;i<j;i++,j--) {
//				tmp = baguni[i];
//				baguni[i] = baguni[j];
//				baguni[j] = tmp;
//				System.out.println(baguni[i]);
//				System.out.println(baguni[j]);
//				
//			}
//		}// for end
		
		// check
//		for(int c=0;c<baguni.length;c++) {
//			if(c == baguni.length-1) {
//				System.out.print(baguni[c]+" \n");
//			}else {
//				System.out.print(baguni[c]+" ");
//			}
//		}// check for end

//	} // main() method end
//
//}

// j-i = 1,2 > 1 >> 어케하노 (j-i)/2 = 0.5,1 > 1
// j-i == 3,4 > 2  			 (j-i)/2 = 1.5,2 > 2

// 1 2 3 4 5 6 
// 6 5 4 3 2 1 
// 1 2 3 4 5 
// 5 4 3 2 1 


//t1

//if((j-i)%2 == 1) { //j-i가 홀수일때
//
//}else if((j-i)%2 == 0) { //j-i가 짝수일때
//
//}else {	// j-i가 0일때
//
//}

//t2
//while(stop) {
//int i = 0;
//int j = 3;
//System.out.println(baguni[i]);
//i++;
//if(i == j) {
//	stop = false;
//}
//}// while end

//t3
//boolean stop = true;
//
//for(int a=2;stop;a++) {
//	int i = 2;
//	int j = 8;		
//	System.out.println(baguni[a]);
//	if(i == j) {
//		stop = false;
//	}
//}

//t4
//int i = 0;
//int s = 0;
//while(s<baguni.length) {
//	System.out.println(baguni[s]);
//	s++;
//	i = sc.nextInt();
//	System.out.println("i:"+i);
//	i++;
//}

//t5
//while(i<j) {
//tmp = baguni[i];
//baguni[i] = baguni[j];
//baguni[j] = tmp;
//System.out.println(baguni[i]);
//System.out.println(baguni[j]);
//i++;
//j--;
//}