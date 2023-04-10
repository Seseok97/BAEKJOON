package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2908 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String[] nums = num.split(" ");
		// 주어진 숫자 둘으로 나누기
		
		int[] num1 = new int[3];
		int[] num2 = new int[3];
		for(int i=0;i<nums.length;i++) {
			if(i == 0) {
				for(int j=0;j<nums[i].length();j++) {
					num1[j] = Integer.parseInt(nums[i].substring(j, j+1));
				}	
			}
			if(i == 1) {
				for(int j=0;j<nums[i].length();j++) {
					num2[j] = Integer.parseInt(nums[i].substring(j, j+1));
				}		
			}
		}// for end	
		// 주어진 숫자를 나누어 각 배열에 저장

		int tmp1 = num1[0];
		num1[0] = num1[2];
		num1[2] = tmp1;
		
		int tmp2 = num2[0];
		num2[0] = num2[2];
		num2[2] = tmp2;
		// 숫자의 순서를 변경
	
		
		if(num1[0] > num2[0]) {
			for(int i=0;i<num1.length;i++) {
				System.out.print(num1[i]);
			}
		}else if(num1[0] == num2[0]) {
			if(num1[1] > num2[1]) {
				for(int i=0;i<num1.length;i++) {
					System.out.print(num1[i]);
				}
			}else if(num1[1] == num2[1]) {
				if(num1[2] > num2[2]) {
					for(int i=0;i<num1.length;i++) {
						System.out.print(num1[i]);
					}
				}else if(num1[2] < num2[2]) {
					for(int i=0;i<num2.length;i++) {
						System.out.print(num2[i]);
					}
				}
			}else {
				for(int i=0;i<num2.length;i++) {
					System.out.print(num2[i]);
				}
			}
		}else {
			for(int i=0;i<num2.length;i++) {
				System.out.print(num2[i]);
			}
		}
		// 세자리 수를 각각 비교, 첫번째 수가 같으면 두번째 수 비교, 두번째도 같은경우 세번쩨 수 비교
		

	}// main() method end

} // public class end

// t1
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	String nums = sc.nextLine();
//	char[] num = new char[nums.length()];
//	for(int i=0;i<nums.length();i++) {
//		num[i] = nums.charAt(i);
//		System.out.println(num[i]);
//	}// for end
//	
//	char[] num1 = new char[3];
//	char[] num2 = new char[3];
//	for(int i=0;i<3;i++) {
//		num1[i] = num[i];
//		num2[i] = num[i+4];
//	}
//	
//	for(int i=0;i<3;i++) {
//		System.out.println((i+1)+": "+(num1[i])+", "+(num2[i]));
//	}
//
//}// main() method end
