package baekjoon;

import java.util.Scanner;

public class Q_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] nums = new int[N];
		for(int i = 0; i<nums.length;i++) {
			int num = sc.nextInt();
			if(num < X) {
			nums[i] = num;
			}
		}
		for(int i = 0; i<nums.length;i++) {
			if(nums[i] != 0){
				System.out.print(nums[i]+" ");
			}
		}

	}

}
