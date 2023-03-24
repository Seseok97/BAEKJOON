package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		List<String>words = new ArrayList<String>();
		for(int i=0;i<=T;i++) {
			String str = sc.nextLine();
			words.add(str);
		}

		for(int i = 1;i<words.size();i++) {
			String w = words.get(i);
			String first = w.substring(0,1);
			String last = w.substring(w.length()-1,w.length());
			System.out.println(first+last);
		}

	}

}// public class end


//String test = "ABCED";
//
//System.out.println(test.length());
//System.out.println(test.substring(0,1));
//System.out.println(test.substring(test.length()-1,test.length()));
//
//for(int i = 0;i<T;i++) {
//	String str = sc.nextLine();
//	for(int j = 0;j<T;j++) {
//	String first = str.substring(0,1);
//	String last = str.substring(str.length()-1,str.length());
//	System.out.println(first+last);
//	}
//}