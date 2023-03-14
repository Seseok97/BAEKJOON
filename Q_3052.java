package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>nums = new ArrayList<Integer>();
		
		// num > (0~1000 사이의 입력된 정수)%42
		int j=0;
		while(j<10) {
			int num = sc.nextInt();
			nums.add(num%42);
			j++;
		}
		// tmp > 0~41까지 모든 정수
		ArrayList<Integer>tmp = new ArrayList<Integer>();
		for(int i=0;i<42;i++) {
			tmp.add(i);
		}
		//tmp에서 nums 제거
		
		// tmp와 0~41 비교, 없을때마다 카운트 1증가
		tmp.removeAll(nums);	
		int count = 0;
		for(int i=0;i<42;i++) {
			if(!(tmp.contains(i))) {
				count += 1;
			}
		}
		System.out.println(count);

	}// main() method end

}


// array

//int[] nums = new int[10];
//
//int k = 0;
//while(k<nums.length) {
//	int num = sc.nextInt();
//	nums[k]=num%42;
//	k++;
//}
//
//for(int i = 0; i< nums.length;i++) {
//	System.out.println(nums[i]);
//}

// try1
//int count = 0;
//for(int i = 0; i< nums.length;i++) {
//	for(int j = 0; j< nums.length;j++) {
//		if(nums[i] == nums[j]) {
//			count += 1;
//		}
//	}//infor end
//}//outfor end
//count -= nums.length;
//System.out.println(count);

//try2
//int a = 0;
//int b = 1;
//if(nums[a] == nums[b]) {
//	a = 1;
//}

// try3
//int count = 0;
//for(int i = 0; i< nums.length;i++) {
//	for(int j = 0; j< nums.length;j++) {
//		if(nums[i] == nums[j]) {
//			nums[i] = -1;
//			nums[j] = -2;
//			count += 1;
//		}
//	}//infor end
//}//outfor end
//count -= nums.length;
//System.out.println(count);