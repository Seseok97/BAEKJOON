package baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Q_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char[] wordArr = word.toCharArray();
		int check=1;
		
		if(word.length() != 1) {
			if(wordArr.length%2 == 0) { // 짝수일때
				// [0] == [.length]
				// [1] == [.length-1]
				// [2] == [.length-2] ...
				
				for(int i=0;i<wordArr.length/2;i++) {
						if(wordArr[i] != wordArr[wordArr.length-1-i]) {
							check = 0;
							break;
						}
				}//even for end
					
			}else { // 홀수일때
				ArrayList<Character> oddArr = new ArrayList<Character>();
				int centerIndexNumber = (int)Math.round(wordArr.length/2.0) -1;
				for(int i=0;i<wordArr.length;i++) {
					if(i != centerIndexNumber) {
					oddArr.add(wordArr[i]);
					}
				}// 중간 인덱스넘버에 해당하는 요소를 제거한 ArrayList oddArr 생성
				
				for(int i=0;i<oddArr.size()/2;i++) {
					if(oddArr.get(i) != oddArr.get(oddArr.size()-1-i)) {
						check = 0;
						break;
					}
				}// odd for end
	
			}// i-e end
		}
		System.out.println(check);
		sc.close();


	}//main() method end

}// public class end
