package baekjoon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Q_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// 전체학생
//		int[] nums = new int[30];
//		for(int i = 0;i<nums.length;i++) {
//			nums[i] = i+1;
//		}
//		
//		// 제출학생
//		int[] st = new int[28];
//		for(int i = 0;i<st.length;i++) {
//			int num = sc.nextInt();
//			st[i] = num;
//		}
			//전체학생
			List<Integer>stnum = new ArrayList<Integer>();
			for(int i = 0;i<30;i++) {
				stnum.add(i+1);
			}
			// 제출학생
			List<Integer>st = new ArrayList<Integer>();
			for(int i = 0;i<28;i++) {
				int num = sc.nextInt();
				st.add(num);
			}
			
			//차집합
			stnum.removeAll(st);
			st.sort(Comparator.naturalOrder());
			System.out.println(stnum.get(0));
			System.out.println(stnum.get(1));
	}

}
