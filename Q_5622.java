package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q_5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		ArrayList<String>strArr = new ArrayList<String>();
		for(int i=0;i<str.length();i++) {
			String tmp = str.substring(i,i+1);
			strArr.add(tmp);
		}// for end
		// 주어진 문자열 하나씩 나누기
		int time = 0;
		for(int i=0;i<strArr.size();i++) {
			if(strArr.get(i).equals("A") || strArr.get(i).equals("B") || strArr.get(i).equals("C")) {
				time += 3;
			}else if(strArr.get(i).equals("D") || strArr.get(i).equals("E") || strArr.get(i).equals("F")) {
				time += 4;
			}else if(strArr.get(i).equals("G") || strArr.get(i).equals("H") || strArr.get(i).equals("I")) {
				time += 5;
			}else if(strArr.get(i).equals("J") || strArr.get(i).equals("K") || strArr.get(i).equals("L")) {
				time += 6;
			}else if(strArr.get(i).equals("M") || strArr.get(i).equals("N") || strArr.get(i).equals("O")) {
				time += 7;
			}else if(strArr.get(i).equals("P") || strArr.get(i).equals("Q") || strArr.get(i).equals("R") || strArr.get(i).equals("S")) {
				time += 8;
			}else if(strArr.get(i).equals("T") || strArr.get(i).equals("U") || strArr.get(i).equals("V")) {
				time += 9;
			}else if(strArr.get(i).equals("W") || strArr.get(i).equals("X") || strArr.get(i).equals("Y") || strArr.get(i).equals("Z")) {
				time += 10;
			}
			// if-es end
		}// for end
		System.out.println(time);
		
		
		
	}// main() method end

}// public class end
