package baekjoon;

import java.util.Scanner;

public class Q_10809 {

	public static void main(String[] args) {
		//아래 코드는 구글 참고해서 작성한 내용임.
		// 완벽하게 학습한 코드도 아닐뿐 더러 클론코딩에 가까운형태 !!
		// 까먹을때쯤 다시 와서 또 풀어보기.
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i] = -1;
		}
		
		String str = sc.next();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(arr[ch -97] == -1) {
				arr[ch-97] = i;
			}
		} // for end
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


	}// main() method end

}// public class end




// t1
//		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		
//		String[] strs = new String[str.length()];
//		for(int i = 0; i < str.length(); i++) {
//			strs[i] = str.substring(i,i+1);
//		}
//		for(int i = 0; i < str.length(); i++) {
//			System.out.println(strs[i]);
//		}
//		for(int i = 0; i < str.length(); i++) {
//			String tmp = strs[i];
//			for(int j = 0;j<alphabet.length;j++) {
//				if(tmp.equals(alphabet[j])) {
//					alphabet[j] = "1";
//				}
//			}// for
//		}// for
//		for(int j = 0; j<alphabet.length;j++) {
//			System.out.print(alphabet[j]+" ");
//		}